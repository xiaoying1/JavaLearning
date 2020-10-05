package com.tplink.lxy.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Test03 {
    @MyAnnotation1(name = "lxy",schools = {"lxy1"})
    public void test(){

    }
    @MyAnnotation2("lxy")
    public void test1(){

    }


}

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1{
    //注解的参数：参数类型+参数名（）
    String name() default "";
    int age () default 0;
    int id() default -1;

    String[] schools() default {"lxy1"};
}
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    String value();
}