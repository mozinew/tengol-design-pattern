package com.tengol.design.pattern.mooc.structural.composite.d1course;

/**
 * Course - 课程类
 *
 * @author dongrui
 * @date 2020/2/19 19:49
 */
public class Course extends CatalogComponent {
    /**
     * 课程名称
     */
    private String name;
    /**
     * 课程价格
     */
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.print(String.format("课程【%s】的价格：%.2f\n", name, price));
    }
}
