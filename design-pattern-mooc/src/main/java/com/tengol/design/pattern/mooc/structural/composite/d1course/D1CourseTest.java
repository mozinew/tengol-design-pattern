package com.tengol.design.pattern.mooc.structural.composite.d1course;

/**
 * D1CourseTest - 客户端类
 *
 * @author dongrui
 * @date 2020/2/19 19:58
 */
public class D1CourseTest {
    public static void main(String[] args) {
        CatalogComponent myCatalog = new Catalog("我的课程目录",1);
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
