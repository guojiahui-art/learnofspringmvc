package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DoSome {


//    定义一个方法用于处理，前端的请求

    @RequestMapping(value = {"/doSome.do","/doOther.do"})
    public ModelAndView doSome(){
        ModelAndView ma = new ModelAndView();
        ma.addObject("name","张三");
        ma.addObject("email","1209681667@qq.com");
        ma.setViewName("show");
        return ma;
    }
}
