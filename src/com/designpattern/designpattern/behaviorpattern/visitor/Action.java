package com.designpattern.designpattern.behaviorpattern.visitor;

/**
 * Created by 62691
 * on 2022/1/28 20:53
 *
 * @author swaggyw
 * 抽象类 - 访问者
 */
abstract public class Action {
    /**
     * 得到男性的投票结果
     * @param man 男性
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女性的投票结果
     * @param woman 女性
     */
    public abstract void getWomanResult(Woman woman);
}
