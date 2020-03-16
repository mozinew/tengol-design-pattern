package com.tengol.design.pattern.mooc.structural.composite.d2course;

/**
 * Course - 课程类
 * 由于采用安全式的组合模式，故需要在该具体类中定义特有的操作，比如 getPrice()
 *
 * @author dongrui
 * @date 2020/2/19 21:27
 */
public class Course implements CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.print(String.format("课程【%s】的价格：%.2f\n", name, price));
    }

    public double getPrice(){
        return price;
    }
}
