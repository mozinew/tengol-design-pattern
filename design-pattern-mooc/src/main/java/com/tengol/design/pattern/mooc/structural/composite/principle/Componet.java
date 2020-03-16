package com.tengol.design.pattern.mooc.structural.composite.principle;

/**
 * Componet - 抽象构建
 *
 * @author dongrui
 * @date 2020/2/15 12:25
 */
public interface Componet {
    void add(Componet componet);

    void remove(Componet componet);

    Componet getChild(int i);

    void operation();
}
