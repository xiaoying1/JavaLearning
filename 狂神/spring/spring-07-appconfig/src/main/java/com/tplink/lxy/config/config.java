package com.tplink.lxy.config;


import com.tplink.lxy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public User getUser(){
        return new User();
    }
}
