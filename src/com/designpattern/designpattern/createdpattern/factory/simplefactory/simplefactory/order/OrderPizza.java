package com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.order;

import com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.factory.PizzaFactory;
import com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.pizza.CheesePizza;
import com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.pizza.GreekPizza;
import com.designpattern.designpattern.createdpattern.factory.simplefactory.simplefactory.pizza.Pizza;

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
//    // 定义一个简单工厂对象
//    private PizzaFactory factory = new PizzaFactory();

    public OrderPizza() {
    }

    public void orderPizza() {

        do {
            try {
                String name = this.getType();
                Pizza pizza = PizzaFactory.createPizza(name);
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                break;
            }

        } while (true);
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
