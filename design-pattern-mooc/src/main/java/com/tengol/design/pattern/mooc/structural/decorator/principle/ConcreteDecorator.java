package com.tengol.design.pattern.mooc.structural.decorator.principle;

/**
 * ConcreteDecorator
 *
 * @author dongrui
 * @date 2020/2/25 22:15
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction(){
        System.out.println("为具体构建角色增加额外的功能 addedFunction()");
    }
}
