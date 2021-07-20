package com.winemall.mall.controller;
import com.winemall.mall.entity.*;
import com.winemall.mall.service.CategoryService;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/19
 * @Description: This is a part of the training project
 */

@RestController

public class CategoryController {

    @Reference
    private CategoryService categoryService;

    @RequestMapping("/mainpage")
    public List<GoodsSold> getAllGoods(){
        return categoryService.getRandomGoods();
    }

    @RequestMapping("/mainpage/rank")
    public List<GoodsSold> getRankedGoods(){
        return categoryService.getRankedGoods(100);
    }


}
