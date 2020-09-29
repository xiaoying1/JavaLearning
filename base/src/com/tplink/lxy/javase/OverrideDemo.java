package com.tplink.lxy.javase;

public class OverrideDemo {
    public static void main(String[] args) {

        A a = new A();
        B b = new A();

        a.test1();
        b.test1();

        a.test2();
        b.test2();


    }
}
class B{
    public static void test1(){
        System.out.println("B_statist");
    }
    public void test2(){
        System.out.println("B");
    }
}
class A extends B{

    public static void test1(){
        System.out.println("A_statist");
    }

    @Override
    public void test2(){
        System.out.println("A");
    }

}