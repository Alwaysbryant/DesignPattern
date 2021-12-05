package com.designpattern.principle.interfacesegregation.gregation02;

/**
 * Created by swaggyW
 * on 2021/12/3 16:21
 */
public class A {
    public void depend1(I1 i) {
        i.m1();
    }

    public void depend2(I2 i) {
        i.m2();
    }

    public void depend3(I2 i) {
        i.m3();
    }
}
