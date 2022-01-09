package com.designpattern.designpattern.structurepattern.bridge;

/**
 * Created by 62691
 * on 2022/1/9 15:42
 *
 * @author swaggyw
 * 具体手机品牌： 华为
 */
public class HuaWei implements Brand{
    @Override
    public void call() {
        System.out.println("使用华为打电话。。。");
    }

    @Override
    public void open() {
        System.out.println("华为开机...");
    }

    @Override
    public void close() {
        System.out.println("华为关机...");
    }
}
