package com.designpattern.principle.singleresponsibility;

/**
 * Created by swaggyW
 * on 2021/12/3 14:56
 *
 * 单一职责原则2
 * 根据不同的职责创建不同的类，来独立每一个职责
 * 具体如下代码
 *
 * 根据不同的交通工具调用不同的类，这样就完成了单一职责原则
 * 缺点：
 * ==============================
 *
 * 如果又有新的职责要修改，那我们就有需要添加不同的类，这样会十分繁琐
 * 花费的开销会非常大，
 * 所以进一步进行修改，虽然修改后不在满足单一职责原则，但是对一个类中的方法层面都是单一职责的
 * {@SingleResp03}
 *
 */
public class SingleResp02 {

    public static void main(String[] args) {
        new RoadVehicle().run("汽车");
        new RiverVehicle().run("轮船");
    }
}


/**
 * 陆地上的交通工具使用的类
 */
class RoadVehicle {

    /**
     * 输入交通工具类型，开始运行，PS：仅仅限于陆地上跑的
     * @param vehicle
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "在行驶...");
    }
}

/**
 * 水里面跑的交通工具使用
 */
class RiverVehicle {

    /**
     * 输入交通工具类型，开始运行，PS： 仅仅限于水中使用的
     * @param vehicle
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "在行驶...");
    }

}
