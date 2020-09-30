package com.tplink.lxy.JavaEE.proxy;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHelloWorld(String name) {
        System.out.println("Hello World "+name);
    }
}
