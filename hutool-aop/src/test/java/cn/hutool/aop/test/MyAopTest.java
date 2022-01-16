package cn.hutool.aop.test;

import cn.hutool.aop.ProxyUtil;
import cn.hutool.aop.aspects.Aspect;
import cn.hutool.aop.aspects.SimpleAspect;
import cn.hutool.aop.aspects.TimeIntervalAspect;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author qianfang, at 2022/1/16, 11:14 PM
 **/
public class MyAopTest {

    @Test
    public void MyTest() {
        My my = ProxyUtil.proxy(new My(), MyAspect.class);
        String hello = my.sayHello("hello");
        System.out.println("======");
        System.out.println(hello);
    }


    static class My {
        public String sayHello(String hello) {
            System.out.println(hello);
            return hello + ": fq";
        }
    }
}
