package com.designpattern.designpattern.structurepattern.decorator;

/**
 * Created by 62691
 * on 2022/1/10 17:29
 *
 * @author swaggyw
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.2);
    }
}
