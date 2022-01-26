package com.designpattern.designpattern.behaviorpattern.command;

/**
 * Created by 62691
 * on 2022/1/26 16:39
 *
 * @author swaggyw
 * 命令接收者
 */
public class LightReceiver {

    public void on() {
        System.out.println("开灯");
    }

    public void off() {
        System.out.println("关灯");
    }
}
