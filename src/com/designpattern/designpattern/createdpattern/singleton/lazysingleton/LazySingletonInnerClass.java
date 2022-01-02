package com.designpattern.designpattern.createdpattern.singleton.lazysingleton;

/**
 * Created by 62691
 * on 2022/1/2 18:05
 *
 * @author swaggyw
 *
 * 静态内部类实现单例
 */
public class LazySingletonInnerClass {
    public static void main(String[] args) {
        SingletonInnerClass instance = SingletonInnerClass.getInstance();
        SingletonInnerClass instance1 = SingletonInnerClass.getInstance();

        //print true...
        System.out.println(instance == instance1);
    }
}

class SingletonInnerClass {
    private static SingletonInnerClass instance;

    private static class InnerClass {
        private final static SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    /**
     * 私有化构造器
     */
    private SingletonInnerClass() {}

    public static SingletonInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }
}
