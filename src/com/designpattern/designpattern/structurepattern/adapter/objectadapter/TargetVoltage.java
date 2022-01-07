package com.designpattern.designpattern.structurepattern.adapter.objectadapter;

/**
 * Created by 62691
 * on 2022/1/7 16:26
 *
 * @author swaggyw
 *
 * 目标对象，即目标的电压
 */
public interface TargetVoltage {

    /**
     * 给手机充电所需要的电压
     * @return
     */
    int targetVoltage();
}
