package com.designpattern.designpattern.structurepattern.decorator;

import com.designpattern.designpattern.createdpattern.factory.factorymethod.orderpizza.CantonOrderPizza;

/**
 * Created by 62691
 * on 2022/1/10 17:37
 *
 * @author swaggyw
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink coffee = new LatteCoffee();
        System.out.println(coffee.getDes() + coffee.cost());
        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDes() + coffee.cost());
        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDes() + coffee.cost());
    }
}
