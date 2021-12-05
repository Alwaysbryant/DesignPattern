package com.designpattern;

/**
 * Created by swaggyW
 * on 2021/12/3 11:00
 * 设计模式之单例模式
 *
 * =================================
 * 单例模式确保再系统中只存在一个实例对象。
 * 特点： 只有一个实例； 自我实例化； 保证全局访问。
 * 缺点： 整个系统中该对象只有一个实例，会导致该实例的职责很重，违背了设计模式的--单一职责原则。
 *
 * ==============================
 * 使用场景： 再spring中的ioc容器中，bean的作用域默认是单例bean。
 * 单例的好处： 当容器中存在某一实例时，不需要再创建，直接从map中取（三级缓存），并且可以减少gc的次数，获取bean比较快速
 *
 *  劣势：  无法保证线程安全。
 *
 * =====================================
 * 再多线程条件下，我们通常使用双重校验锁，代码如下
 */
public class Singleton {

    /****************************************************/
    /**********  单线程场景********************************/
    //定义一个全局唯一的但实例引用
    private Singleton singleton;

    /**
     * 创建私有构造器防止其他用户创建对象
     */
//    private Singleton () {
//
//    }

    /**
     * 获得单例对象
     * @return 返回这个单例对象
     */
    public Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;

    }

    /************************************************************/
    /**********************多线程场景 ******************************/

    //多线程的条件下，我们要保证可见性，每次读取到的都是最新的对象实例。
    public static volatile Singleton instance;

    //同样的私有化构造器
    private Singleton() {

    }

    /**
     * 双重校验锁，
     * @return 单例对象实例
     */
    public static Singleton getInstance() {
        if (instance == null) {
            //给类对象加锁。
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    return instance;
                }
            }
        }

        return instance;
    }

}
