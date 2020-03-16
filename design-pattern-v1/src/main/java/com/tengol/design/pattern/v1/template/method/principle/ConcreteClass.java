package com.tengol.design.pattern.v1.template.method.principle;

/**
 * ConcreteClass - 具体子类
 * 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤
 *
 * @author dongrui
 * @date 2020/3/16 12:39
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("调用抽象方法1的实现......");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("调用抽象方法2的实现......");
    }
}
