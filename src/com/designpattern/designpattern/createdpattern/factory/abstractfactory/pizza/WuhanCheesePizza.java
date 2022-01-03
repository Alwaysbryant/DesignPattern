package com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizza;



/**
 * Created by 62691
 * on 2022/1/2 22:15
 *
 * @author swaggyw
 */
public class WuhanCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备武汉的芝士披萨。。。");
    }
}
