package com.tengol.design.pattern.v1.template.method.principle2;

/**
 * HookConcreteClass - 含钩子方法的具体子类
 *
 * @author dongrui
 * @date 2020/3/16 14:02
 */
public class HookConcreteClass extends HookAbstractClass{
    /**
     * 抽象方法 1
     */
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用......");
    }

    /**
     * 抽象方法 2
     */
    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用......");
    }

    /**
     * 钩子方法 1
     */
    @Override
    public void hookMethod1() {
        System.out.println("钩子方法1倍重写了......");
    }

    /**
     * 钩子方法 2
     *
     * @return 默认返回 true
     */
    @Override
    public boolean hookMethod2() {
        return false;
    }
}
