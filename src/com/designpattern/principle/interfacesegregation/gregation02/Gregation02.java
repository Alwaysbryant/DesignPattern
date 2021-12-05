package com.designpattern.principle.interfacesegregation.gregation02;

/**
 * Created by swaggyW
 * on 2021/12/3 16:13
 *
 * 接口隔离原则
 *  具体场景可以看markdown文档。
 *  该类所模拟的场景是对于只有一个接口I
 *  即使A和C都只是需要三个方法
 *  但是作为B和D 都必须实现这5个方法
 *  这样就会导致类十分臃肿，很显然是不符合接口隔离原则的，
 *  因为我们根本不需要另外两个方法
 *  优化方式： 将接口I拆分成多个接口
 *  => {@Gregation02}
 */
public class Gregation02 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }
}

