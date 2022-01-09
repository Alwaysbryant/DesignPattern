package com.designpattern.designpattern.structurepattern.bridge;

/**
 * Created by 62691
 * on 2022/1/9 15:39
 *
 * @author swaggyw
 * 品牌接口： 不同的手机品牌
 */
public interface Brand {

    /**
     * 打电话
     */
    void call();

    /**
     * 开机
     */
    void open();

    /**
     * 关机
     */
    void close();
}
