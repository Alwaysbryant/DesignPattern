package com.designpattern.designpattern.structurepattern.composite;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 62691
 * on 2022/1/12 17:34
 *
 * @author swaggyw
 *
 * 学校
 */
public class University extends Organization{
    /**
     * 学校下面的子组件
     */
    private List<Organization> colleges = new ArrayList<>();



    public University(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("------"+ getName() +"------");
        for(Organization college: colleges) {
            college.print();
        }
    }

    @Override
    protected void add(Organization organization) {
        colleges.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        colleges.remove(organization);
    }
}
