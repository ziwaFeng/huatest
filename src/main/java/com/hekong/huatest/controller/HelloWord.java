package com.hekong.huatest.controller;

import com.hekong.huatest.domain.Resource;
import com.hekong.huatest.tools.ZJSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWord {

    @RequestMapping("/hello")
    public String hello(String name){
        return "hello " + name;
    }

    @Autowired
    Resource resource;

    @RequestMapping("/getResource")
    public ZJSONResult getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return ZJSONResult.ok(bean);
    }
}
