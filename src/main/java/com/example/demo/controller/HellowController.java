package com.example.demo.controller;

import com.example.demo.pojo.JSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by Administrator on 2019\6\15 0015.
 */
@RestController
public class HellowController {

    @RequestMapping("/hellow")
    public Object hellow(){
        return "leee";
    }

    @RequestMapping("/hello")
    public Object hello() {
        return "hello springboot~~";
    }

    @RequestMapping("/result")
    public JSONResult result(){
        JSONResult jsonResult =new JSONResult();

        return JSONResult.success("lishief");
    }
}
