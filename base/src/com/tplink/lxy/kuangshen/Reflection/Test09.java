package com.tplink.lxy.kuangshen.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class c1 = Class.forName("com.tplink.lxy.kuangshen.Reflection.User");

        User user = (User) c1.newInstance();//本质是调用无参构造器
        System.out.println(user);

        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user1 = (User) constructor.newInstance("lxy",001,18);
        System.out.println(user1);
    }
}
