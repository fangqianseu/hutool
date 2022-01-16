package cn.hutool.aop.test;

import cn.hutool.aop.aspects.SimpleAspect;

import java.lang.reflect.Method;

/**
 * @author qianfang, at 2022/1/16, 11:29 PM
 **/
public class MyAspect extends SimpleAspect {
    @Override
    // 返回值 true 继续执行原有方法逻辑； false 不执行原有方法
    public boolean before(Object target, Method method, Object[] args) {
        System.out.println("before method");
        return true;
    }

    @Override
    // 返回值 true 返回原始返回结果 false 返回null
    public boolean after(Object target, Method method, Object[] args, Object returnVal) {
        System.out.println("after method");
        return true;
    }
}
