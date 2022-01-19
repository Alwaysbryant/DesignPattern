package com.designpattern.designpattern.structurepattern.proxy.cglib;

import java.awt.*;

/**
 * Created by 62691
 * on 2022/1/19 17:22
 *
 * @author swaggyw
 */
public class TeacherProxy implements MethodInterceptor{
    /**
     * 目标对象
     */
    private Object target;

    /**
     * 返回代理对象
     * @param target 传入目标对象
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        // 加强器工具类，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        Object obj = enhancer.create();
        return obj;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        // 调用目标对象的方法
        Object result = method.invoke(target, args);
        return result;
    }
}
