package com.designpattern.designpattern.structurepattern.facade;

/**
 * 屏幕
 */
public class Screen {
    /* 饿汉式 */
    private static final Screen screen = new Screen();

    private Screen() {}

    public static Screen getInstance() {
        return screen;
    }

    public void up() {
        System.out.println(" the screen is up...");
    }

    public void down() {
        System.out.println(" the screen is down...");
    }
}
