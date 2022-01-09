package com.designpattern.designpattern.structurepattern.bridge;

/**
 * Created by 62691
 * on 2022/1/9 15:45
 *
 * @author swaggyw
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠屏手机。。。");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠屏手机。。。");

    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠屏手机。。。");

    }


}
