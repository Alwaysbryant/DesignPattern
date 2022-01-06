package com.designpattern.designpattern.createdpattern.builder.builder;

import com.designpattern.designpattern.createdpattern.builder.product.House;

/**
 * Created by 62691
 * on 2022/1/6 17:08
 *
 * @author swaggyw
 * 抽象建造者： 指定建造的流程，即方法
 */
public abstract class HouseBuilder {
    /* 建造的产品 */
    House house = new House();

    /**
     * 建造地基
     */
    public abstract void buildBasic();

    /**
     * 建造墙壁
     */
    public abstract void buildWall();

    /**
     * 建造屋顶
     */
    public abstract void buildRoof();

    /**
     * 返回建造对象
     * @return
     */
    public House buildHouse() {
        return house;
    }
}
