package com.designpattern.designpattern.createdpattern.singleton.lazysingleton;

/**
 * Created by 62691
 * on 2022/1/2 17:35
 * @author swaggyw
 *
 * 懒汉式最基本实现，无法保证线程的安全
 */
public class LazySingletonThreadUnsafe {
    public static void main(String[] args) {
        SingletonUnsafe instance = SingletonUnsafe.getInstance();
        SingletonUnsafe instance1 = SingletonUnsafe.getInstance();

        // 由于当前环境是单线程，所以是没有任何问题的，对于多线程就不一样了。。。
        System.out.println(instance == instance1); //print true...
    }
}

class SingletonUnsafe {
    // 定义一个单例对象的引用
    private static SingletonUnsafe instance;

    /**
     * 私有化构造器
     */
    private SingletonUnsafe() {}

    public static SingletonUnsafe getInstance() {
        // 同时两个线程进入if语句，就会创建两个单例对象
        if (instance == null) {
            instance = new SingletonUnsafe();
        }
        return instance;
    }
}
