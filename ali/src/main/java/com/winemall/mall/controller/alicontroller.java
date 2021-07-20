package com.winemall.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
public class alicontroller {

    @RequestMapping("/picture")
    public String picture() {

        return getImgFileToBase64("./ali/pay.jpg");
    }

    public String getImgFileToBase64(String imgFile) {
        //将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        InputStream inputStream = null;
        byte[] buffer = null;
        //读取图片字节数组
        try {
            inputStream = new FileInputStream(imgFile);
            int count = 0;
            while (count == 0) {
                count = inputStream.available();
            }
            buffer = new byte[count];
            inputStream.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    // 关闭inputStream流
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // 对字节数组Base64编码, 去除换行
        String res = new BASE64Encoder().encode(buffer).replaceAll("[\\n\\r]","");
        return res;
    }

}

