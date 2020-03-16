package com.tengol.design.pattern.mooc.structural.bridge.principle;

/**
 * ConcreteImplementorB
 * 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现
 *
 * @author dongrui
 * @date 2020/2/25 11:08
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("使用 B 方式实现");
    }
}
