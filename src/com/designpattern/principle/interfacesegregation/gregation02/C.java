package com.designpattern.principle.interfacesegregation.gregation02;

/**
 * Created by swaggyW
 * on 2021/12/3 16:22
 */
public class C {

    public void depend1(I1 i) {
        i.m1();
    }

    public void depend4(I3 i) {
        i.m4();
    }

    public void depend5(I3 i) {
        i.m5();
    }
}
