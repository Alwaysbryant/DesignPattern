package com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizzastore;

import com.designpattern.designpattern.createdpattern.factory.abstractfactory.factory.WuhanFactory;
import com.designpattern.designpattern.createdpattern.factory.abstractfactory.orderpizza.OrderPizza;

/**
 * Created by 62691
 * on 2022/1/3 20:05
 *
 * @author swaggyw
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza().orderPizza(new WuhanFactory());
    }
}
