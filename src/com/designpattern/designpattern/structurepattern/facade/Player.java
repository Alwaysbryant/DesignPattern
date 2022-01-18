package com.designpattern.designpattern.structurepattern.facade;

/**
 * 播放器类
 */
public class Player {
    // 单例模式
    // 双重校验锁
    private static volatile Player player;

    private Player() {}

    public static Player getInstance() {
        if (player == null) {
            synchronized (Player.class) {
                if (player == null) {
                    player = new Player();
                }
            }
        }
        return player;
    }

    public void on() {
        System.out.println("player is opened...");
    }

    public void off() {
        System.out.println("play is closed...");
    }

    public void pause() {
        System.out.println("player is paused...");
    }

    public void play() {
        System.out.println("player is working...");
    }
}
