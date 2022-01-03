package com.designpattern.designpattern.createdpattern.factory.abstractfactory.factory;

import com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizza.*;

/**
 * Created by 62691
 * on 2022/1/3 19:58
 *
 * @author swaggyw
 */
public class CantonFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza = null;
        if ("beef".equals(name)) {
            System.out.println("制作广州牛肉披萨...");
            pizza = new CantonBeefPizza();
        } else if ("cheese".equals(name)) {
            System.out.println("制作广州芝士披萨...");
            pizza = new CantonCheesePizza();
        } else {
            System.out.println("没有这个披萨...");
        }
        return pizza;
    }
}
