package com.designpattern.designpattern.structurepattern.decorator;

/**
 * Created by 62691
 * on 2022/1/10 16:39
 *
 * @author swaggyw
 * 抽象类，抽象饮品的价格和描述
 */
abstract public class Drink {
    /**
     * 饮品的描述
     */
    private String des;

    /**
     * 饮品的价格
     */
    private double price;

    public void setDes(String des) {
        this.des = des;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDes() {
        return des;
    }

    /**
     * 饮品的价格
     * @return
     */
    public abstract double cost();
}
