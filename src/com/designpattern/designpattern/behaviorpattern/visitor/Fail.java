package com.designpattern.designpattern.behaviorpattern.visitor;

/**
 * Created by 62691
 * on 2022/1/28 20:57
 *
 * @author swaggyw
 * 具体的访问者
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("得到男性投票一张： 失败~");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("得到女性投票一张： 失败~");
    }
}
