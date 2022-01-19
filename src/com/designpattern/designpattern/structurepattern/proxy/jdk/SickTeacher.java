package com.designpattern.designpattern.structurepattern.proxy.jdk;

/**
 * Created by 62691
 * on 2022/1/19 16:54
 *
 * @author swaggyw
 */
public class SickTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("我是老师，我生病了，有人帮我教书。。。");
    }
}
