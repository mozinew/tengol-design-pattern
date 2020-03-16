package com.tengol.design.pattern.mooc.structural.composite.d1course;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Catalog - 目录类，只实现目录响应的操作
 *
 * @author dongrui
 * @date 2020/2/19 19:52
 */
public class Catalog extends CatalogComponent {
    /**
     * 目录名称
     */
    private String name;
    /**
     * 目录级别
     */
    private Integer level;
    /**
     * 课程集合
     */
    private List<CatalogComponent> components = new ArrayList<>();

    public Catalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent component) {
        this.components.add(component);
    }

    @Override
    public void remove(CatalogComponent component) {
        this.components.remove(component);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Integer getLevel() {
        return this.level;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (CatalogComponent com : components) {
            //若是目录，则增加缩进
            if (Objects.nonNull(this.level)) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            //打印
            com.print();
        }
    }
}
