package com.tengol.design.pattern.mooc.structural.decorator.principle;

/**
 * ConcreteComponet
 *
 * @author dongrui
 * @date 2020/2/25 22:06
 */
public class ConcreteComponet implements Componet {
    public ConcreteComponet() {
        System.out.println("创建具体构建角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构建角色的方法 operation()");
    }
}
