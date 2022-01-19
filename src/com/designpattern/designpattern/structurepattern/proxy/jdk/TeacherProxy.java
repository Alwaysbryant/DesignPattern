package com.designpattern.designpattern.structurepattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 62691
 * on 2022/1/19 16:55
 *
 * @author swaggyw
 */
public class TeacherProxy implements InvocationHandler {
    /**
     * 目标对象
     */
    private Object target;

    /**
     * 获取到一个代理对象
     * @param obj
     * @return
     */
    public Object getInstance(Object obj) {
        this.target = obj;
        /**
         * classloader: 加载代理对象
         * interfaces: 被代理类实现的接口，即当前对象this
         * 实现了InvocationHandler的对象
         */
        Object instance = Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), this);
        return instance;
    }

    /**
     * 通过代理对象，反射调用目标对象的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你们的老师生病了");
        Object invoke = method.invoke(target, args);
        System.out.println("我来教书。");
        return invoke;
    }
}
