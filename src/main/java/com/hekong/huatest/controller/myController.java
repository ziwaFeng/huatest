package com.hekong.huatest.controller;

import com.hekong.huatest.domain.Person;
import com.hekong.huatest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class myController {

    @Value("${my.name}")
    private String name ;
    @Value("${my.age}")
    private String age;




    @RequestMapping("/getUser")
    public String getUser(){
        return "name:"+name +" age:"+age;
    }

    @Autowired
    private Person person;

    @RequestMapping("/getPreson")
    public String getPerson(){
        return person.toString();
    }


}
