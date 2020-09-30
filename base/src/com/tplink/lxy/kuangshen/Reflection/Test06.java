package com.tplink.lxy.kuangshen.Reflection;

public class Test06 {
    static {
        System.out.println("Main类被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //主动引用
//        Son son = new Son();
        //反射也会产生主动引用
//        Class.forName("com.tplink.lxy.kuangshen.reflection.Son");



        //不会产生类的引用的方法
        //通过子类引用父类的静态变量，不会导致子类初始化
        System.out.println(Son.b);
        //通过数组定义类引用时，不会触发类的初始化
        Son[] array = new Son[5];
        //引用常量不会触发此类的初始化（常量在链接阶段就存入调用类的常量池中了）
        System.out.println(Son.M);
    }
}

class Father{
    static int b=2;

    static {
        System.out.println("父类被加载");
    }

}
class Son extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}
