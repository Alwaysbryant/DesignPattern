package com.designpattern.designpattern.structurepattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 62691
 * on 2022/1/12 17:39
 *
 * @author swaggyw
 */
public class College extends Organization{
    private List<Organization> departments = new ArrayList<>();

    public College(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("- " + getName());

        for (Organization department: departments) {
            department.print();
        }
    }

    @Override
    protected void add(Organization organization) {
        departments.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        departments.remove(organization);
    }
}
