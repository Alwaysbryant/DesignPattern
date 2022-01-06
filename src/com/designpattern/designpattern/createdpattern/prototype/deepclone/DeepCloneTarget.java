package com.designpattern.designpattern.createdpattern.prototype.deepclone;

import java.io.Serializable;

/**
 * Created by 62691
 * on 2022/1/6 16:13
 *
 * @author swaggyw
 *
 * 在默认的情况下，实现CloneAble接口，并重写clone方法后，对于引用类型，对象的拷贝是浅拷贝
 * 如何实现对象的深拷贝：
 * 1. 通过clone方法来实现
 * 2. 通过序列化来实现
 */
public class DeepCloneTarget implements Cloneable, Serializable {
    private String name;
    private String classname;

    public DeepCloneTarget(String name, String classname) {
        this.name = name;
        this.classname = classname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
