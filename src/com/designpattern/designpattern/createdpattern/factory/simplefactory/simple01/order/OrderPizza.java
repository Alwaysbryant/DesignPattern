package com.designpattern.designpattern.createdpattern.factory.simplefactory.simple01.order;

import com.designpattern.designpattern.createdpattern.factory.simplefactory.simple01.pizza.CheesePizza;
import com.designpattern.designpattern.createdpattern.factory.simplefactory.simple01.pizza.GreekPizza;
import com.designpattern.designpattern.createdpattern.factory.simplefactory.simple01.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 62691
 * on 2022/1/2 21:21
 *
 * @author swaggyw
 *
 * 订购披萨
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;

        do {
            String type = this.getType();
            if (type.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨，");
            } else if (type.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("芝士披萨，");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while(true);
    }

    private String getType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza's type you want: ");
            String s = reader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
