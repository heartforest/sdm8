package com.forest.sdm8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName ThymeleafController
 * Description TODO
 * Author hforest
 * Date 2018/12/28 21:55
 * Version 1.0
 **/
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/greeting")
    public ModelAndView greeting(ModelAndView mv) {
        mv.setViewName("/greeting");
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }

    @RequestMapping("/test")
    public String test() {
        return "";
    }

}
