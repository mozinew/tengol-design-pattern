package com.tengol.design.pattern.mooc.structural.composite.d2course;


/**
 * 安全式的组合模式
 * 由于采用安全式的组合模式，因此客户端需要明确地知道目录类、课程类这2个子类
 *
 * @author dongrui
 * @date 2020/2/19 19:58
 */
public class D2CourseTest {
    public static void main(String[] args) {
        Catalog myCatalog = new Catalog("我的课程目录",1);
        myCatalog.add(new Course("数据结构与算法",299.99));
        myCatalog.add(new Course("设计模式",299.99));

        Catalog javaCatalog = new Catalog("java技术课程",2);
        javaCatalog.add(new Course("Spring高级课程",199.99));
        javaCatalog.add(new Course("MyBatis高级课程",199.99));
        javaCatalog.add(new Course("Netty高级课程",399.99));

        myCatalog.add(javaCatalog);

        myCatalog.print();

    }
}
