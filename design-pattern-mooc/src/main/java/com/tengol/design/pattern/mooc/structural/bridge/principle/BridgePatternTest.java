package com.tengol.design.pattern.mooc.structural.bridge.principle;

/**
 * BridgePatternTest - 客户端类
 *
 * @author dongrui
 * @date 2020/2/25 11:17
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abs = new RefinedAbstraction(implementorA);

        abs.operation();
    }
}
