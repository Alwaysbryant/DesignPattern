package com.designpattern.designpattern.structurepattern.composite;

/**
 * Created by 62691
 * on 2022/1/12 17:42
 *
 * @author swaggyw
 * 专业
 */
public class Department extends Organization{
    public Department(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println("-- " + getName());
    }
}
