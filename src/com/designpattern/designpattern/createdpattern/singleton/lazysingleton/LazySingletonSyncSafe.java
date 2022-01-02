package com.designpattern.designpattern.createdpattern.singleton.lazysingleton;

/**
 * Created by 62691
 * on 2022/1/2 17:41
 *
 * @author swaggyw
 *
 * 通过对方法加锁来实现线程安全，但是如此做，每个线程都会进行一次同步判断，这样
 * 效率是非常低的，可以进行优化
 */
public class LazySingletonSyncSafe {
    public static void main(String[] args) {
        SingletonSync instance = SingletonSync.getInstance();
        SingletonSync instance1 = SingletonSync.getInstance();

        //print true...
        System.out.println(instance == instance1);
    }
}

class SingletonSync {
    // 定义单例对象 引用
    private static SingletonSync instance;

    private SingletonSync() {}

    /**
     * 返回单例对象， issue： 锁的粒度太大，效率低
     * @return
     */
    public static synchronized SingletonSync getInstance() {
        if (instance == null) {
            instance = new SingletonSync();
        }
        return instance;
    }
}
