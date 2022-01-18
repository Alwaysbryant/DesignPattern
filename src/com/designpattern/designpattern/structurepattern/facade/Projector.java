package com.designpattern.designpattern.structurepattern.facade;

/**
 * 投影仪
 */
public class Projector {
    private static final Projector projector = new Projector();

    private Projector() {}

    public static Projector getInstance() {
        return projector;
    }

    public void on() {
        System.out.println("the projector is opened...");
    }

    public void off() {
        System.out.println("the projector is closed...");
    }

    public void focus() {
        System.out.println("the projector is focus...");
    }
}
