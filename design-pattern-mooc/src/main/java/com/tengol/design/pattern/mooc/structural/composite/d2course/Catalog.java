package com.tengol.design.pattern.mooc.structural.composite.d2course;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Catalog - 目录类
 * 由于采用安全式的组合模式，故需要在该具体类中定义特有的操作，比如 add()/remove()
 *
 * @author dongrui
 * @date 2020/2/19 21:20
 */
public class Catalog implements CatalogComponent {
    private String name;
    private Integer level;
    private List<CatalogComponent> components = new ArrayList<>();

    public Catalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName() {
        return this.name;
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

    public void add(CatalogComponent component){
        components.add(component);
    }

    public void remove(CatalogComponent component){
        components.remove(component);
    }
}
