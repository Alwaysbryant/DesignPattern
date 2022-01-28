package com.designpattern.designpattern.behaviorpattern.visitor;

/**
 * Created by 62691
 * on 2022/1/28 20:54
 *
 * @author swaggyw
 *
 * 具体的被访问者
 */
public class Man extends Person{

    /* 显然，Action作为形参，不遵循迪米特法则 */
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
