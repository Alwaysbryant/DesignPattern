package com.designpattern.designpattern.structurepattern.decorator;

/**
 * Created by 62691
 * on 2022/1/10 17:28
 *
 * @author swaggyw
 *
 * 具体的配料
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(4.0);
    }
}
