package com.designpattern.principle.interfacesegregation.gregation01;

/**
 * Created by swaggyW
 * on 2021/12/3 16:22
 */
public class C {

    public void depend1(I i) {
        i.m1();
    }

    public void depend4(I i) {
        i.m4();
    }

    public void depend5(I i) {
        i.m5();
    }
}
