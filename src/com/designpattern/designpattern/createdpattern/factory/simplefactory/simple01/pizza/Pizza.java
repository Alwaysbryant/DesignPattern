package com.designpattern.designpattern.createdpattern.factory.simplefactory.simple01.pizza;

/**
 * Created by 62691
 * on 2022/1/2 21:16
 *
 * @author swaggyw
 *
 * 披萨抽象类，定义披萨的制作过程
 */
public abstract class Pizza {
    protected String name;

    /**
     * 准备披萨
     */
    public abstract void prepare();

    /**
     * 制作披萨
     */
    public void bake() {
        System.out.println(name + " baking...");
    }

    /**
     * 切披萨
     */
    public void cut() {
        System.out.println(name + "cutting...");
    }

    /**
     * 打包披萨
     */
    public void box() {
        System.out.println(name + "boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
