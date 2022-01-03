package com.designpattern.designpattern.createdpattern.factory.abstractfactory.factory;

import com.designpattern.designpattern.createdpattern.factory.abstractfactory.pizza.Pizza;

/**
 * Created by 62691
 * on 2022/1/3 19:57
 *
 * @author swaggyw
 * 抽象工厂
 */
public interface AbstractFactory {

    /**
     * 制作披萨
     * @param name
     * @return
     */
    Pizza createPizza(String name);
}
