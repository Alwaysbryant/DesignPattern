package com.designpattern.designpattern.createdpattern.builder.builder.impl;

import com.designpattern.designpattern.createdpattern.builder.builder.HouseBuilder;

/**
 * Created by 62691
 * on 2022/1/6 17:10
 *
 * @author swaggyw
 *
 * 简单房子建造者
 */
public class SimpleHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("简单房子的地基建造了5米...");
    }

    @Override
    public void buildWall() {
        System.out.println("简单房子的墙砌了20cm厚...");
    }

    @Override
    public void buildRoof() {
        System.out.println("简单房子的屋顶用的茅草...");
    }
}
