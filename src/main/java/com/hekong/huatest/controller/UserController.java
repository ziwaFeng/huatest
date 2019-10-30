package com.hekong.huatest.controller;
import com.hekong.huatest.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @RequestMapping("/listUser")
    public User listUser() {
        User user = new User();
        user.setUserName("hekong1");
        user.setAge(18);
        user.setPassword("123456");
        user.setDate(new Date());
        user.setDev("java test333333..");
        return user;

//        List<User> listUser = new ArrayList<>();
//        User user = null;
//        for(int i=0; i<10; i++) {
//            user = new User();
//            user.setId((i + 1) + "" );
//            user.setUserName("张三"  + i);
//            user.setAge((20 + i) + "");
//            listUser.add(user);
//        }
//        model.addAttribute("users", listUser);

    }
}
