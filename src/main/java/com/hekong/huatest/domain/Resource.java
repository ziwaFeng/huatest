package com.hekong.huatest.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by zhihuaFeng on 2019/10/30.
 */

@Configuration//加载属性前缀
@ConfigurationProperties(prefix = "com.hekong.openres")
@PropertySource(value= "classpath:resource.properties")
public class Resource {
    private String name ;
    private String website;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
