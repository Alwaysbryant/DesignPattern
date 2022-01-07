package com.designpattern.designpattern.structurepattern.adapter.classadapter;

/**
 * Created by 62691
 * on 2022/1/7 16:25
 *
 * @author swaggyw
 * 220V电压，被适配器
 */
public class FamilyVoltage {

    public int voltage() {
        int voltage = 220;
        System.out.println("家庭用电电压为: " + voltage);
        return voltage;
    }
}
