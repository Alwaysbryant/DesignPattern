package com.designpattern.designpattern.structurepattern.flyweight;

/**
 * 具体的享元类，实现抽象类，
 * 访问的网站都是一样的，而途径不一样，way属性为内部状态，即可以被共享，当时不同网站的用户不一样
 * 所以user为外部状态。
 */
public class ConcreteWebsite extends Website {

    private String way;

    public ConcreteWebsite(String way) {
        this.way = way;
    }

    public ConcreteWebsite() {}

    @Override
    public void use(User user) {
        System.out.println("通过 " + way + "访问网站，用户名是： " + user.getName());
    }
}
