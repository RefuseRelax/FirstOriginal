package com.firstoriginal.online.controller;

import com.firstoriginal.online.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WriteController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getWrite")
    @ResponseBody
    public String getWrite(String[] article){
        articleService.insert(article);
        return "z";
    }
}
