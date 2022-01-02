package com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.pizzastore;

import com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.order.OrderPizza;

/**
 * Created by 62691
 * on 2022/1/2 21:27
 *
 * @author swaggyw
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.orderPizza();
    }
}
