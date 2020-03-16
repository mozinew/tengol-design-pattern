package com.tengol.design.pattern.mooc.structural.composite.principle;

/**
 * CompositePatternClient
 *
 * @author dongrui
 * @date 2020/2/15 12:31
 */
public class CompositePatternTest {
    public static void main(String[] args) {
        Componet c0 = new Composite();
        Componet leaf1 = new Leaf("1号树叶节点");
        c0.add(leaf1);

        Componet leaf2 = new Leaf("2号树叶节点");
        Componet leaf3 = new Leaf("3号树叶节点");
        Componet c1 = new Composite();
        c1.add(leaf2);
        c1.add(leaf3);
        c0.add(c1);

        c0.operation();
    }
}
