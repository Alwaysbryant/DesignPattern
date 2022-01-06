package com.designpattern.designpattern.createdpattern.builder.director;

import com.designpattern.designpattern.createdpattern.builder.builder.HouseBuilder;
import com.designpattern.designpattern.createdpattern.builder.product.House;

/**
 * Created by 62691
 * on 2022/1/6 17:14
 *
 * @author swaggyw
 * 建造指挥者
 */
public class BuildingDirector {

    /**
     * 抽象建造者
     */
    private HouseBuilder houseBuilder;

    public BuildingDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public BuildingDirector() {
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 处理建造流程，并返回产品
     * @return
     */
    public House buildHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        House house = houseBuilder.buildHouse();
        return house;
    }
}
