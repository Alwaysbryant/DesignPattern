package com.designpattern.designpattern.createdpattern.singleton.hungrysingleton;

/**
 * Created by 62691
 * on 2022/1/2 17:24
 * @author swaggyw
 *
 * 通过静态同步代码块来实现
 */
public class HungrySingletonStaticSyncCode {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton instance = MySingleton.getInstance();
        // print true...    correct
        System.out.println(mySingleton == instance);
    }
}

class MySingleton {
    private static MySingleton instance;

    private MySingleton() {}

    /**
     * 静态同步代码块
     */
    static {
        instance = new MySingleton();
    }

    /**
     * 返回单例对象
     * @return
     */
    public static MySingleton getInstance() {
        return instance;
    }
}
