package com.tplink.lxy.javase;

public class Polymorphism {
    public static void main(String[] args) {

        Student s1 = new Student();
        Person s2 = new Student();
        Object s3 = new Student();

        //对象能执行哪些方法，主要看对象左边的类型
        s1.run();
        s2.run();
        ((Student) s3).run();
    }
}
class Person{
    public void run(){
        System.out.println("Person");
    }
}
class Student extends Person{
    @Override
    public void run() {
        System.out.println("Student");
    }
}