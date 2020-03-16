package com.tengol.design.pattern.mooc.structural.composite.d1course;

/**
 * CatalogComponent - 课程与目录的抽象类，包含了目录类与课程类的两类操作
 * （1）目录类，支持 add()/remove()/getName()/print() 操作
 * （2）课程类，支持 getName()/getPrice()/print() 操作
 *
 * @author dongrui
 * @date 2020/2/19 19:42
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent component){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent component){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印作");
    }
}
