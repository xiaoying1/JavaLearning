package com.tplink.lxy.kuangshen.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//分析性能
public class Test10 {
    //普通方法
    public static void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法："+(endTime-startTime)+"ms");
    }
    //反射方法
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);


        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);

        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方法："+(endTime-startTime)+"ms");
    }
    //反射方法 关闭检测

    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);

        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方法，关闭检测："+(endTime-startTime)+"ms");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }
}
