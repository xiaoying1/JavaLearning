package com.tplink.lxy.proxy;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHelloWorld(String name) {
        System.out.println("Hello World "+name);
    }
}
