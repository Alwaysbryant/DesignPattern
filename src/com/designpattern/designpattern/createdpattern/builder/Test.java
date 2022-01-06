package com.designpattern.designpattern.createdpattern.builder;

import com.designpattern.designpattern.createdpattern.builder.builder.impl.HighHouseBuilder;
import com.designpattern.designpattern.createdpattern.builder.builder.impl.SimpleHouseBuilder;
import com.designpattern.designpattern.createdpattern.builder.director.BuildingDirector;
import com.designpattern.designpattern.createdpattern.builder.product.House;

/**
 * Created by 62691
 * on 2022/1/6 17:16
 *
 * @author swaggyw
 */
public class Test {
    public static void main(String[] args) {
        // BuildingDirector director = new BuildingDirector(new SimpleHouseBuilder());
        BuildingDirector director = new BuildingDirector(new HighHouseBuilder());
        House house = director.buildHouse();
    }
}
