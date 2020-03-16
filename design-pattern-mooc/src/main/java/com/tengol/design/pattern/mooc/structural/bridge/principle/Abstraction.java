package com.tengol.design.pattern.mooc.structural.bridge.principle;

/**
 * Abstraction - 抽象化角色
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用
 *
 * @author dongrui
 * @date 2020/2/25 11:09
 */
public abstract class Abstraction {
    //使用组合方式关联实现化角色
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 供客户端调用的业务方法
     */
    abstract void operation();
}
