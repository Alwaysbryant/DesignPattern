package com.designpattern.principle.liskovsubstitution.liskovsubstitution01;

/**
 * Created by 62691
 * on 2021/12/31 16:07
 *
 * 里氏替换原则： 在继承中，子类尽量不要重写父类的方法。
 * 假设有一个行为P1，在使用父类的方法，而另一行为P2在使用子类的方法，而该方法刚好被子类重写，
 * 那么就会出现错误。这样是不符合里氏替换原则的。
 *
 * 具体实例如下，有两个类A,B 以及对应的方法
 *
 * 修改，{@LiskovSubstitution}
 */
public class LiskovSubstitutionTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        //print -1 , 2.....correct
        System.out.println(a.f1(1, 2));
        System.out.println(a.f1(3, 1));
        System.out.println("-----");
        //target => 2-1=1, fact => 2+1=3
        System.out.println(b.f1(2, 1));
        /**
         * 则会出现错误，原本子类调用f1方法是为了做减法运算，结果是加法运算
         * 这是因为子类重写了父类的方法，导致程序出现了错误。
         */
    }
}

class A {
    public int f1(int a, int b) {
        return a - b;
    }
}

class B extends A {

    @Override
    public int f1(int a, int b) {
        return a + b;
    }

    public int f2(int a, int b) {
        return a * b;
    }
}
