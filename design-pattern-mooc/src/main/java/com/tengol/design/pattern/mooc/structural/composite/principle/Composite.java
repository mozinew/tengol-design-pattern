package com.tengol.design.pattern.mooc.structural.composite.principle;

import java.util.ArrayList;

/**
 * Composite - 树枝构建
 *
 * @author dongrui
 * @date 2020/2/15 12:28
 */
public class Composite implements Componet {
    private ArrayList<Componet> children = new ArrayList<Componet>();

    public void add(Componet componet) {
            children.add(componet);
    }

    public void remove(Componet componet) {
        children.remove(componet);
    }

    public Componet getChild(int i) {
        return children.get(i);
    }

    public void operation() {
        for(Componet componet : children){
            componet.operation();
        }
    }
}
