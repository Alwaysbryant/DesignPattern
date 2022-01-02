package com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.pizza;

/**
 * Created by 62691
 * on 2022/1/2 21:19
 *
 * @author swaggyw
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("希腊披萨正在准备中...");
    }
}
