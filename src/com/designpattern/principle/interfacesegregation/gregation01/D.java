package com.designpattern.principle.interfacesegregation.gregation01;

/**
 * Created by swaggyW
 * on 2021/12/3 16:21
 */
public class D implements I {
    @Override
    public void m1() {
        System.out.println("类D实现接口I的方法1");

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {
        System.out.println("类D实现接口I的方法4");

    }

    @Override
    public void m5() {
        System.out.println("类D实现接口I的方法5");

    }
}
