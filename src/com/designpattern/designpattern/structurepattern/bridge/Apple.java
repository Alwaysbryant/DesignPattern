package com.designpattern.designpattern.structurepattern.bridge;

/**
 * Created by 62691
 * on 2022/1/9 15:41
 *
 * @author swaggyw
 * 具体的品牌类： 苹果手机
 */
public class Apple implements Brand{


    @Override
    public void call() {
        System.out.println("使用iPhone打电话。。。");
    }

    @Override
    public void open() {
        System.out.println("苹果手机开机...");
    }

    @Override
    public void close() {
        System.out.println("苹果手机关机...");
    }
}
