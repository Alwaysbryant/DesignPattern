package com.designpattern.designpattern.structurepattern.adapter.objectadapter;

/**
 * Created by 62691
 * on 2022/1/7 16:27
 *
 * @author swaggyw
 * 适配器，继承被适配类，并实现目标对象接口
 */
public class Adapter implements TargetVoltage {
    private FamilyVoltage familyVoltage;

    public Adapter(FamilyVoltage familyVoltage) {
        this.familyVoltage = familyVoltage;
    }

    @Override
    public int targetVoltage() {
        int voltage = familyVoltage.voltage();
        int target = voltage / 44;
        System.out.println("充电所需的电压为: " + target);
        return target;
    }
}
