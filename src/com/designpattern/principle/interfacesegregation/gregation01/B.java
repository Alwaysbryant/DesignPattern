package com.designpattern.principle.interfacesegregation.gregation01;

/**
 * Created by swaggyW
 * on 2021/12/3 16:20
 */ //类B，实现接口I
public class B implements I {

    @Override
    public void m1() {
        System.out.println("类B实现接口I的方法1");
    }

    @Override
    public void m2() {
        System.out.println("类B实现接口I的方法2");
    }

    @Override
    public void m3() {
        System.out.println("类B实现接口I的方法3");

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }
}
