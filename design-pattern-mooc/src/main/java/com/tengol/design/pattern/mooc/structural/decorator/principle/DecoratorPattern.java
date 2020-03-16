package com.tengol.design.pattern.mooc.structural.decorator.principle;

/**
 * DecoratorPattern
 *
 * @author dongrui
 * @date 2020/2/25 22:17
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Componet componet = new ConcreteComponet();
        componet.operation();

        System.out.println("--------");

        Decorator decorator = new ConcreteDecorator(componet);
        decorator.operation();
    }
}
