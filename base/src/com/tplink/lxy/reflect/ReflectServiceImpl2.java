package com.tplink.lxy.reflect;

public class ReflectServiceImpl2 {
    private String name;

    public ReflectServiceImpl2(String name) {
        this.name = name;
    }

    public void sayhello(){
        System.out.println("Hello_"+name);
    }
}
