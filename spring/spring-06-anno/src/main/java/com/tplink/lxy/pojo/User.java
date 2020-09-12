package com.tplink.lxy.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//<bean id="user" class="com.tplink.lxy.pojo.User"/>
@Component
//@Repository
//@Service
//@Controller衍生注解
public class User {
    @Value("lxy")
    public String name;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
