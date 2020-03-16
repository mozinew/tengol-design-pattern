package com.tengol.design.pattern.mooc.structural.composite.d2course;

/**
 * CatalogComponent - 目录与课程的抽象组件，仅包含二者相同的操作
 * 由于采用安全式的组合模式，此处只需要抽象出目录与课程相同的操作即可，各自特有的操作延迟到子类定义
 *
 * @author dongrui
 * @date 2020/2/19 20:53
 */
public interface CatalogComponent {
    String getName();
    void print();
}
