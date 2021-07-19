package com.winemall.mall.controller;

import com.winemall.mall.pojo.TbBasic;
import com.winemall.mall.service.PictureService;
import com.winemall.mall.service.UserService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
//import org.springframework.data.annotation.Reference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/pic")
@RestController
public class PictureController {
    //远程调度: 图片服务器
    @Reference
    private PictureService pictureService;
    @Reference
    private UserService userService;
    @RequestMapping("/upload")
    public String upload(@RequestParam("uploadFile") MultipartFile uploadFile,String phone) throws Exception{
        //注意dubbo不能在不同服务间传递MutipartFile，因为MuitipartFile是不可序列化的,需要转为byte[]
        //commons-io模块中的IOUtils,将输入流转换成字节数组
        byte[] bytes = IOUtils.toByteArray(uploadFile.getInputStream());
        //获取文件大小
        Long fileSize = uploadFile.getSize();
        //获取上传文件的扩展名
        String extension = FilenameUtils.getExtension(uploadFile.getOriginalFilename());
        //调用图片服务的方法来上传图片到fastDFS服务器
        String fileUrl = pictureService.upload(bytes,fileSize,extension);
        //调用用户服务的方法来同步更新当前用户上传的头像url到TB_BASIC表
        TbBasic basic = new TbBasic();
        basic.setPhone(phone);
        basic.setHeadImages(fileUrl);
        userService.updateBasic(basic);
        return fileUrl;
    }
}
