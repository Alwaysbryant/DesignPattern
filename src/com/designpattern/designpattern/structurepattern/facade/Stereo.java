package com.designpattern.designpattern.structurepattern.facade;

/**
 * 立体声
 */
public class Stereo {
    /* 顺便复习一下单例模式的几种写法 */
    /* 静态代码块 */
    private static Stereo stereo;
    static {
        stereo = new Stereo();
    }

    public static Stereo getInstance() {
        return stereo;
    }

    public void on() {
        System.out.println("stereo is opened...");
    }

    public void off() {
        System.out.println("stereo is closed...");
    }
}
