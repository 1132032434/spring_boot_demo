package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoViewController {

    @RequestMapping("DemoHelloWord")
    public String hello(Model model){
        model.addAttribute("hello","changbolin");
        return "/DemoHelloWord";
    }


}
