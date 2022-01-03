package com.designpattern.designpattern.createdpattern.factory.abstractfactory.factory;

import com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizza.Pizza;
import com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizza.WuhanBeefPizza;
import com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizza.WuhanCheesePizza;

/**
 * Created by 62691
 * on 2022/1/3 19:58
 *
 * @author swaggyw
 */
public class WuhanFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza = null;
        if ("beef".equals(name)) {
            System.out.println("制作武汉牛肉披萨...");
            pizza = new WuhanBeefPizza();
        } else if ("cheese".equals(name)) {
            System.out.println("制作武汉芝士披萨...");
            pizza = new WuhanCheesePizza();
        } else {
            System.out.println("没有这个披萨...");
        }
        return pizza;
    }
}
