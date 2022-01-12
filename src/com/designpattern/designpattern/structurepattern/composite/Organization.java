package com.designpattern.designpattern.structurepattern.composite;

/**
 * Created by 62691
 * on 2022/1/12 17:29
 *
 * @author swaggyw
 *
 * 组织架构
 */
abstract public class Organization {
    /**
     * 组织名称
     */
    private String name;

    public Organization(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 添加默认方法，模板设计，交给子类去实现
     * @param organization
     */
    protected void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    /**
     * 默认方法，交给子类实现
     * 删除组织
     * @param organization
     */
    protected void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印组织信息
     */
    protected abstract void print();

}
