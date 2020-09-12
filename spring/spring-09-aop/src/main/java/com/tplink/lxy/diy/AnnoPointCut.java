package com.tplink.lxy.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnoPointCut {
    @Before("execution(* com.tplink.lxy.service.UserserviceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }
    @After("execution(* com.tplink.lxy.service.UserserviceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }
    @Around("execution(* com.tplink.lxy.service.UserserviceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println(jp.getSignature());
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }

}
