package com.designpattern.principle.interfacesegregation.gregation02;

/**
 * Created by swaggyW
 * on 2021/12/3 16:21
 */
public class D implements I1,I3 {
    @Override
    public void m1() {
        System.out.println("类D实现接口I的方法1");

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
