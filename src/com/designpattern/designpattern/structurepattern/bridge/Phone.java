package com.designpattern.designpattern.structurepattern.bridge;

/**
 * Created by 62691
 * on 2022/1/9 15:43
 *
 * @author swaggyw
 *
 * 抽象类手机： 作为桥接模式的桥梁将品牌与手机类型连接
 */
abstract public class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
