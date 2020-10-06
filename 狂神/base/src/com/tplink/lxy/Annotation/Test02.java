package com.tplink.lxy.Annotation;

import java.lang.annotation.*;

//元注解
public class Test02 {


}
//Target 表示注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//表示注解在什么地方有效（runtime》class》source）
@Retention(value = RetentionPolicy.RUNTIME)
//是否将我们的注解生成在javadoc
@Documented
//说明子类可以继承父类中的该注解
@Inherited
@interface MyAnnotation{

}
