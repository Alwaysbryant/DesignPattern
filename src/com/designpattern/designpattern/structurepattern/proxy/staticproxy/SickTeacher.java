package com.designpattern.designpattern.structurepattern.proxy.staticproxy;

/**
 * Created by 62691
 * on 2022/1/19 16:44
 *
 * @author swaggyw
 */
public class SickTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("教授学生知识。。。");
    }
}
