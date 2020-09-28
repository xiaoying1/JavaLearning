package com.tplink.lxy.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.tplink.lxy.reflection.User");

        //获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        System.out.println("==========================");
        //获得类的属性
        Field[] fields = c1.getFields();//只能找到public属性
        for(Field field:fields){
            System.out.println(field);
        }
        fields = c1.getDeclaredFields();//找到全部属性
        for(Field field:fields){
            System.out.println(field);
        }
        //获得指定属性
        System.out.println(c1.getDeclaredField("name"));

        //获得类的方法
        System.out.println("==========================");
        Method[] methods = c1.getMethods();//获得本类及其父类的全部public方法
        for (Method method:methods){
            System.out.println("getMethods:"+method);
        }
        methods = c1.getDeclaredMethods();//获得本类的所有方法
        for (Method method:methods){
            System.out.println("getDeclaredMethods:"+method);
        }

        //获得指定方法
        System.out.println("==========================");
        Method getName = c1.getMethod("getName",null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);


        //获得构造器
        System.out.println("==========================");
        Constructor[] constructors = c1.getConstructors();
        for(Constructor constructor:constructors){
            System.out.println("getConstructors:"+constructor);
        }
        constructors = c1.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            System.out.println("getDeclaredConstructors:"+constructor);
        }

    }
}
