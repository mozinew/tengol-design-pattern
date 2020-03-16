package com.tengol.design.pattern.v1.template.method.principle;

/**
 * AbstractClass - 抽象类
 * （1）抽象类负责给出一个算法的轮廓和骨架。
 * （2）它由一个模板方法和若干个基本方法构成；
 * （3）模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法
 * （4）基本方法：是整个算法中的一个步骤，包含以下几种类型
 *      1）抽象方法：在抽象类中声明，由具体子类实现它
 *      2）具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它
 *      3）钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种
 *
 * @author dongrui
 * @date 2020/3/16 12:36
 */
public abstract class AbstractClass {
    public void templateMethod(){
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void specificMethod(){
        System.out.println("调用抽象类中的具体方法");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}
