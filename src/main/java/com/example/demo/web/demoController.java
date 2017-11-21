package com.example.demo.web;

import com.example.demo.entity.DemoInfo;
import com.example.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @Autowired
    private DemoMapper infoMapper;

    @RequestMapping("/get")
    public DemoInfo getdemoInfo(Integer id){
        return  infoMapper.selectByPrimaryKey(id);
    }

}
