package com.designpattern.designpattern.createdpattern.singleton.hungrysingleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by 62691
 * on 2022/1/2 17:14
 * @author swaggy
 *
 * 饿汉式单例模式，
 * 在类中定义一个常量，并且实例化对象，通过方法来进行返回
 */
public class HungrySingletonConstant {
    public static void main(String[] args) {
        // test...
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // print true... correct
        System.out.println(instance1 == instance2);
    }
}

/**
 * 单例对象
 */
class Singleton {
    // 直接创建单例对象
    private static final Singleton INSTANCE = new Singleton();

    /**
     * 私有化构造器
     */
    private Singleton() {}

    /**
     * 获取单例对象的方法
     * @return
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
