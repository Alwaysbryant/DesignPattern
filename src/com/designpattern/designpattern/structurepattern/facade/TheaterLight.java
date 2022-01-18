package com.designpattern.designpattern.structurepattern.facade;

/**
 * 电影院灯光
 */
public class TheaterLight {
    private static final TheaterLight light = new TheaterLight();

    private TheaterLight() {}

    public static TheaterLight getInstance() {
        return light;
    }

    public void on() {
        System.out.println("the light is opened...");
    }

    public void off() {
        System.out.println("the light is closed...");
    }

    public void dim() {
        System.out.println("the light is dim...");
    }

    public void bright() {
        System.out.println("the light is bright");
    }
}
