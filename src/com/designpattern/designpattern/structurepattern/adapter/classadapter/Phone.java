package com.designpattern.designpattern.structurepattern.adapter.classadapter;

/**
 * Created by 62691
 * on 2022/1/7 16:29
 *
 * @author swaggyw
 *
 * 手机类，进行充电操作
 */
public class Phone {

    public static void charging(TargetVoltage voltage) {
        int i = voltage.targetVoltage();
        if (i == 5) {
            System.out.println("手机正常充电中...");
        } else {
            System.out.println("充电失败");
        }
    }

    public static void main(String[] args) {
        charging(new Adapter());
    }
}
