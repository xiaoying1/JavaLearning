package com.tplink.lxy.Annotation;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Test01 extends  Object{
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")
    public void test02(){
        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }

}
