package com.designpattern.designpattern.behaviorpattern.visitor;

/**
 * Created by 62691
 * on 2022/1/28 20:55
 *
 * @author swaggyw
 * 具体的被访问者
 */
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
