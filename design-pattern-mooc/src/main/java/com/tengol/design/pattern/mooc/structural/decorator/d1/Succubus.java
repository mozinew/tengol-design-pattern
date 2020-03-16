package com.tengol.design.pattern.mooc.structural.decorator.d1;

/**
 * Succubus
 *
 * @author dongrui
 * @date 2020/2/25 22:35
 */
public class Succubus extends Changer {
    public Succubus(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        super.display();
        setChanger();
    }

    public void setChanger(){
        OriginalMorrigan morrigan = (OriginalMorrigan) super.morrigan;
        morrigan.setImage("Morrigan1.jpg");
    }
}
