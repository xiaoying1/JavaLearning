package com.tplink.lxy.JavaEE.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
        ReflectServiceImpl1 object1 = getInstance1();
        object1.sayhello("lxy");

        ReflectServiceImpl2 object2 = getInstance2("lxy");
        object2.sayhello();

        Object object3 = reflectMethod("lxy");
        System.out.println(object3);

    }
    public static ReflectServiceImpl1 getInstance1(){
        ReflectServiceImpl1 object = null;
        try {
            object = (ReflectServiceImpl1)Class.forName("com.tplink.lxy.JavaEE.reflect.ReflectServiceImpl1").newInstance();

        }catch (ClassNotFoundException|InstantiationException|IllegalAccessException ex){
            ex.printStackTrace();
        }
        return  object;
    }
    public static ReflectServiceImpl2 getInstance2(String name){
        ReflectServiceImpl2 object = null;
        try {
            object = (ReflectServiceImpl2)Class.forName("com.tplink.lxy.JavaEE.reflect.ReflectServiceImpl2").getConstructor(String.class).newInstance(name);

        }catch (ClassNotFoundException|InstantiationException|IllegalAccessException|NoSuchMethodException|SecurityException|IllegalArgumentException| InvocationTargetException ex){
            ex.printStackTrace();
        }
        return  object;
    }
    public  static Object reflectMethod(String name){
        Object returnobj =null;
        ReflectServiceImpl1 target = new ReflectServiceImpl1();
        try {
            Method method = ReflectServiceImpl1.class.getMethod("sayhello", String.class);
            returnobj = method.invoke(target,name);//target.sayHello("lxy")
        } catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException e) {
            e.printStackTrace();
        }
        return returnobj;
    }
}
