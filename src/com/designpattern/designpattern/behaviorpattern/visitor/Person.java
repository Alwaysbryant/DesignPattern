package com.designpattern.designpattern.behaviorpattern.visitor;

/**
 * Created by 62691
 * on 2022/1/28 20:51
 *
 * @author swaggyw
 * 抽象类 - 被访问者
 */
abstract public class Person {
    public abstract void accept(Action action);
}
