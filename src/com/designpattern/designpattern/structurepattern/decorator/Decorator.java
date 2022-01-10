package com.designpattern.designpattern.structurepattern.decorator;

/**
 * Created by 62691
 * on 2022/1/10 17:22
 *
 * @author swaggyw
 *
 * 装饰器
 * 将咖啡包装到配料中
 */
abstract public class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink drink) {
        this.obj = drink;
    }

    /**
     * 得到咖啡和配料的总价格
     * @return
     */
    @Override
    public double cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + "&&" + obj.getDes();
    }
}
