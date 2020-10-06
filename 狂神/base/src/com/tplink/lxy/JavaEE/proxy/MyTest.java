package com.tplink.lxy.JavaEE.proxy;

public class MyTest {
    public static void main(String[] args) {
        testJdkProxy();
    }

    public static void  testJdkProxy(){
        JdkProxyExample jdk = new JdkProxyExample();

        HelloWorld proxy = (HelloWorld)jdk.bind(new HelloWorldImpl());
        proxy.sayHelloWorld("lxy");
    }
}
