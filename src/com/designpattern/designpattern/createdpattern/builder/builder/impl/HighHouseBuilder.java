package com.designpattern.designpattern.createdpattern.builder.builder.impl;

import com.designpattern.designpattern.createdpattern.builder.builder.HouseBuilder;

/**
 * Created by 62691
 * on 2022/1/6 17:12
 *
 * @author swaggyw
 * 楼房建造者
 */
public class HighHouseBuilder extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("楼房的地基建了9米...");
    }

    @Override
    public void buildWall() {
        System.out.println("楼房的墙砌了40cm...");
    }

    @Override
    public void buildRoof() {
        System.out.println("楼房的屋顶用的玻璃...");
    }
}
