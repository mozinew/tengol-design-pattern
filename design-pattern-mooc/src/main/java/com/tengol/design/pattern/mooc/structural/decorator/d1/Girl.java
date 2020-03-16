package com.tengol.design.pattern.mooc.structural.decorator.d1;

/**
 * Girl
 *
 * @author dongrui
 * @date 2020/2/25 22:37
 */
public class Girl extends Changer {

    public Girl(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        super.display();
        setChanger();
    }

    public void setChanger(){
        OriginalMorrigan morrigan = (OriginalMorrigan) super.morrigan;
        morrigan.setImage("Morrigan2.jpg");
    }
}
