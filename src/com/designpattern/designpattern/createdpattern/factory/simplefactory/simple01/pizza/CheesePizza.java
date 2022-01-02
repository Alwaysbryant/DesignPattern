package com.designpattern.designpattern.createdpattern.factory.simplefactory.simple01.pizza;

/**
 * Created by 62691
 * on 2022/1/2 21:20
 *
 * @author swaggyw
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("芝士披萨正在制作中...");
    }
}
