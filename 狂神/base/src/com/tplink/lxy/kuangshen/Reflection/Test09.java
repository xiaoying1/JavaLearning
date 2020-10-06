package com.tplink.lxy.kuangshen.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        //获取class对象
        Class c1 = Class.forName("com.tplink.lxy.kuangshen.Reflection.User");

        //构造一个对象
//        User user = (User) c1.newInstance();//本质是调用无参构造器
//        System.out.println(user);

        //通过构造器创建对象
//        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
//        User user1 = (User) constructor.newInstance("lxy",001,18);
//        System.out.println(user1);

        //通过反射调用普通方法
        User user2 = (User) c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user2,"lxy");
        System.out.println(user2.getName());

        Field name = c1.getDeclaredField("name");

        name.setAccessible(true);//不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true)
        name.set(user2,"lxy1");
        System.out.println(user2.getName());
    }
}
