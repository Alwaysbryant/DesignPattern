package com.designpattern.designpattern.createdpattern.singleton.lazysingleton;

/**
 * Created by 62691
 * on 2022/1/2 18:10
 *
 * @author swaggyw
 */
public class LazySingletonEnum {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance1 = SingletonEnum.INSTANCE;

        // print true...
        System.out.println(instance == instance1);
    }
}

enum SingletonEnum {
    //定义属性
    INSTANCE;

    public SingletonEnum getInstance() {
        return INSTANCE;
    }
}
