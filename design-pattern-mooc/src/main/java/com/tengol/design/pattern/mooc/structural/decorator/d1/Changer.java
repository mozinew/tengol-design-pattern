package com.tengol.design.pattern.mooc.structural.decorator.d1;

/**
 * Changer
 *
 * @author dongrui
 * @date 2020/2/25 22:34
 */
public class Changer implements Morrigan {

    protected Morrigan morrigan;

    public Changer(Morrigan morrigan) {
        this.morrigan = morrigan;
    }

    @Override
    public void display() {
        morrigan.display();
    }
}
