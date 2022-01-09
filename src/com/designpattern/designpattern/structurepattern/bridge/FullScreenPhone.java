package com.designpattern.designpattern.structurepattern.bridge;

/**
 * Created by 62691
 * on 2022/1/9 15:47
 *
 * @author swaggyw
 */
public class FullScreenPhone extends Phone{

    public FullScreenPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("全面屏手机。。。");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("全面屏手机。。。");

    }

    @Override
    protected void call() {
        super.call();
        System.out.println("全面屏手机。。。");

    }
}
