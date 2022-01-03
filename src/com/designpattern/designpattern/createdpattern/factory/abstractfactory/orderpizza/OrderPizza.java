package com.designpattern.designpattern.createdpattern.factory.abstractfactory.orderpizza;

import com.designpattern.designpattern.createdpattern.factory.abstractfactory.factory.AbstractFactory;
import com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 62691
 * on 2022/1/3 19:55
 *
 * @author swaggyw
 */
public class OrderPizza {

    public OrderPizza() {

    }

    public void orderPizza(AbstractFactory factory) {
        do {
            String name = getType();
            Pizza pizza = factory.createPizza(name);
            pizza.setName(name);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
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
