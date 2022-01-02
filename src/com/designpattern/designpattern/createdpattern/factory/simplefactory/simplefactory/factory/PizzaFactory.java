package com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.factory;

import com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.pizza.CheesePizza;
import com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.pizza.GreekPizza;
import com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.pizza.Pizza;

/**
 * Created by 62691
 * on 2022/1/2 21:44
 *
 * @author swaggyw
 * 简单工厂模式
 * 披萨工厂类
 */
public class PizzaFactory {

    public static Pizza createPizza(String name) throws Throwable {
        Pizza pizza = null;
        if (name.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨，");
        } else if (name.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("芝士披萨，");
        } else {
            throw new Throwable("不存在这个披萨...");
        }
        return pizza;
    }
}
