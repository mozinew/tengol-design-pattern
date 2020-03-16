package com.tengol.design.pattern.mooc.structural.composite.principle;

/**
 * Leaf - 叶子构建（具体构建之一）
 *
 * @author dongrui
 * @date 2020/2/15 12:27
 */
public class Leaf implements Componet {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void add(Componet componet) {

    }

    public void remove(Componet componet) {

    }

    public Componet getChild(int i) {
        return null;
    }

    public void operation() {
        System.out.println("树叶 " + name + "：被访问");
    }
}
