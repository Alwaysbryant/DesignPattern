package com.designpattern.principle.singleresponsibility;

/**
 * Created by swaggyW
 * on 2021/12/3 15:04
 *
 * 单一职责原则
 *  ========================
 *  创建不同的方法，这样我们就不需要添加很多类，减少开销
 *  但是这一表现是不满足单一职责原则的
 *  只能确保每一个方法来实现不同的职责
 */
public class SingleResp03 {

    public static void main(String[] args) {
        new MyVehicle().runRiver("轮船");
        new MyVehicle().runRoad("汽车");
    }
}


/**
 * 使用不同的交通工具来实现
 */
class MyVehicle {

    /**
     * 在公路上跑的
     * @param vehicle 交通工具名称
     */
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上行驶...");
    }

    /**
     * 在海上跑的
     * @param vehicle 交通工具名称
     */
    public void runRiver(String vehicle) {
        System.out.println(vehicle + "在海上行驶...");
    }
}
