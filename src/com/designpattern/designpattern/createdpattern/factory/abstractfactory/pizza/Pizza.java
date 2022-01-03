package com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizza;

/**
 * Created by 62691
 * on 2022/1/3 19:53
 *
 * @author swaggyw
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
