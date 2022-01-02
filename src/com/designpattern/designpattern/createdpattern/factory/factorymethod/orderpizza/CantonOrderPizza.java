package com.designpattern.designpattern.createdpattern.factory.factorymethod.orderpizza;

import com.designpattern.designpattern.createdpattern.factory.factorymethod.pizza.Pizza;
import com.designpattern.designpattern.createdpattern.factory.factorymethod.pizza.WuhanBeefPizza;
import com.designpattern.designpattern.createdpattern.factory.factorymethod.pizza.WuhanCheesePizza;

/**
 * Created by 62691
 * on 2022/1/2 22:23
 *
 * @author swaggyw
 */
public class CantonOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String name) {
        Pizza pizza = null;
        if ("cheese".equals(name)) {
            System.out.println("制作广州芝士披萨");
            pizza = new WuhanCheesePizza();
        } else if("beef".equals(name)){
            System.out.println("制作广州牛肉披萨");
            pizza = new WuhanBeefPizza();
        }
        return pizza;
    }
}
