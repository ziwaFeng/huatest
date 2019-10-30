package com.hekong.huatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HuatestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(HuatestApplication.class, args);
        // application.properties文件中的name=ziwa
        System.out.println(app.getEnvironment().getProperty("my.name"));
    }

}
