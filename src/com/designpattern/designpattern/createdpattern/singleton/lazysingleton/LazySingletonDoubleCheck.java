package com.designpattern.designpattern.createdpattern.singleton.lazysingleton;

/**
 * Created by 62691
 * on 2022/1/2 17:48
 *
 * @author swaggyw
 *
 * 双重校验锁
 */
public class LazySingletonDoubleCheck {
    public static void main(String[] args) {
        // test
        SingletonDoubleCheck instance = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();

        // print true...
        System.out.println(instance == instance1);
    }
}

/**
 * 双重校验锁
 */
class SingletonDoubleCheck {

    private static volatile SingletonDoubleCheck instance;

    /**
     * 私有化构造器
     */
    private SingletonDoubleCheck() {}

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }

        return instance;
    }
}
