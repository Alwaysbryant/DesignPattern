package com.designpattern.principle.interfacesegregation.gregation01;

/**
 * Created by swaggyW
 * on 2021/12/3 16:21
 */
public class A {
    public void depend1(I i) {
        i.m1();
    }

    public void depend2(I i) {
        i.m2();
    }

    public void depend3(I i) {
        i.m3();
    }
}
