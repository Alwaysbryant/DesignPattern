package com.designpattern.designpattern.createdpattern.prototype.deepclone;

/**
 * Created by 62691
 * on 2022/1/6 16:19
 *
 * @author swaggyw
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloneProtoType deepCloneProtoType = new DeepCloneProtoType("jack", "teacher", new DeepCloneTarget("deep", "deepclass"));
        DeepCloneProtoType clone = (DeepCloneProtoType) deepCloneProtoType.clone();
        /* 打印出来的引用对象的hashcode不一样，为深拷贝*/
        System.out.println(deepCloneProtoType.getDeepCloneTarget().hashCode());
        System.out.println(clone.getDeepCloneTarget().hashCode());


    }
}
