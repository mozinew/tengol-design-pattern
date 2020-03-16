package com.tengol.design.pattern.mooc.structural.decorator.principle;

/**
 * Decorator
 *
 * @author dongrui
 * @date 2020/2/25 22:07
 */
public class Decorator implements Componet {
    private Componet componet;

    public Decorator(Componet componet) {
        this.componet = componet;
    }

    public void operation(){
        componet.operation();
    }
}
