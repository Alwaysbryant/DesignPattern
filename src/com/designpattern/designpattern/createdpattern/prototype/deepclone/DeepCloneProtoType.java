package com.designpattern.designpattern.createdpattern.prototype.deepclone;

import java.io.*;

/**
 * Created by 62691
 * on 2022/1/6 16:16
 *
 * @author swaggyw
 */
public class DeepCloneProtoType implements Cloneable, Serializable {
    private String name;

    private String job;

    private DeepCloneTarget deepCloneTarget;

    public DeepCloneProtoType(String name, String job, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.job = job;
        this.deepCloneTarget = deepCloneTarget;
    }

    public DeepCloneTarget getDeepCloneTarget() {
        return deepCloneTarget;
    }

    /**
     * 通过clone方法来实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        obj = super.clone();
        //基本数据类型进行拷贝
        DeepCloneProtoType deepCloneProtoType = (DeepCloneProtoType) obj;
        //对引用类型进行单独拷贝
        deepCloneProtoType.deepCloneTarget = (DeepCloneTarget) deepCloneTarget.clone();

        return deepCloneProtoType;
    }

    /**
     * 通过序列化来实现深拷贝
     */
    public Object deepClone() {
        // 创建流对象
        // 输出流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        // 输入流
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            return (DeepCloneProtoType) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流....
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e){

            }
        }
    }
}
