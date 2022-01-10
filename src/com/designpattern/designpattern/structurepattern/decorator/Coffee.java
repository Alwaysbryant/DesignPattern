package com.designpattern.designpattern.structurepattern.decorator;

import java.sql.DriverManager;

/**
 * Created by 62691
 * on 2022/1/10 16:42
 *
 * @author swaggyw
 *
 * 抽象类： 咖啡，继承饮品类
 * 因为饮品 = 咖啡 + 配料
 */
abstract public class Coffee extends Drink {
    @Override
    public double cost() {
        return super.getPrice();
    }
}
