package com.designpattern.designpattern.behaviorpattern.template;

/**
 * Created by 62691
 * on 2022/1/26 13:58
 *
 * @author swaggyw
 */
abstract public class SoyMilk {

    /**
     * 模板方法，即制作豆浆
     * final 修饰 ； 不允许子类去实现
     */
    public final void make() {
        select();
        addIngredients();
        soak();
        beat();
    }

    /**
     * 选料
     */
    public void select() {
        System.out.println("选择豆浆的原材料");
    }

    /**
     * 添加配料，根据不同的口味去添加
     * 由子类去完成
     */
    public abstract void addIngredients();

    public void soak() {
        System.out.println("浸泡食材。。。");
    }

    public void beat() {
        System.out.println("打浆。。。");
    }
}
