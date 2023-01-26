package com.webMvcClassConfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/a1")
public class M1Contrioller
{
    @GetMapping("/m1")
    public ModelAndView n1(){
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        model.addObject("name" , "kia");
        return model;
    }

}
