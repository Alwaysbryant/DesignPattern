package com.designpattern.designpattern.structurepattern.adapter.classadapter;

/**
 * Created by 62691
 * on 2022/1/7 16:27
 *
 * @author swaggyw
 * 适配器，继承被适配类，并实现目标对象接口
 */
public class Adapter extends FamilyVoltage implements TargetVoltage{
    @Override
    public int targetVoltage() {
        int voltage = super.voltage();
        int target = voltage / 44;
        System.out.println("充电所需的电压为: " + target);
        return target;
    }
}
