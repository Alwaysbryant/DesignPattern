package com.designpattern.principle.liskovsubstitution.liskovsubstitution02;

/**
 * Created by 62691
 * on 2021/12/31 16:15
 * @author swaggyw
 * 遵循里氏替换原则，
 * 可以将A，B同等，即让A,B同时继承一个基类Base，
 * 破坏A,B的继承关系
 * 如果想要在子类调用A的减法，则可以让B依赖A
 */
public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        //print -1
        System.out.println(a.f1(1, 2));

        //print 3
        System.out.println(b.f1(1, 2));

        //print -1
        System.out.println(b.f2(1, 2));
    }
}

class Base{}

class A extends Base {
    public int f1(int a, int b) {
        return a - b;
    }
}

class B extends Base {
    private A a;

    public int f2(int a, int b) {
        return this.a.f1(a,b);
    }

    public int f1(int a, int b) {
        return a + b;
    }
}
