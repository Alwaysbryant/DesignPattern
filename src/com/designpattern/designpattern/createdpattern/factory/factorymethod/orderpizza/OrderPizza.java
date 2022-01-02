package com.designpattern.designpattern.createdpattern.factory.factorymethod.orderpizza;

import com.designpattern.designpattern.createdpattern.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 62691
 * on 2022/1/2 22:18
 *
 * @author swaggyw
 * 将订购披萨的方法抽象，由子类来实现。
 */
public abstract class OrderPizza {
    /**
     * 订购披萨
     * @param name
     * @return
     */
    abstract Pizza createPizza(String name);

    public OrderPizza() {
        Pizza pizza = null;
        String name = "";
        do {
            name = getType();
            pizza = this.createPizza(name);
            pizza.setName(name);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.cut();
        } while(true);
    }

    public String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input your pizza: ");
            String s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
