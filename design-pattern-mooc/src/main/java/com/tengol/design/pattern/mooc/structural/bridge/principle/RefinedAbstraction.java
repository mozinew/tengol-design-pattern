package com.tengol.design.pattern.mooc.structural.bridge.principle;

/**
 * RefinedAbstraction - 扩展抽象化角色，实现父类中的业务方法
 * 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *
 * @author dongrui
 * @date 2020/2/25 11:12
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 供客户端调用的业务方法
     */
    @Override
    void operation() {
        System.out.println(this.implementor.getClass());
        this.implementor.operationImpl();
    }
}
