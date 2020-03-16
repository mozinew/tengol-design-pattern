package com.tengol.design.pattern.v1.template.method.principle;

/**
 * 模板方法模式（Template Method）
 *（1）定义：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
 *（2）它是一种类行为型模式。
 *（3）应用场景
 *    在面向对象程序设计过程中，程序员常常会遇到这种情况：设计一个系统时知道了算法所需的关键步骤，而且确定了这些步骤的执行顺序，
 *    但某些步骤的具体实现还未知，或者说某些步骤的实现与具体的环境相关。
 *    例如，去银行办理业务一般要经过以下4个流程：取号、排队、办理具体业务、对银行工作人员进行评分等，其中取号、排队和对银行工作人员进行评分的业务对每个客户是一样的，
 *    可以在父类中实现，但是办理具体业务却因人而异，它可能是存款、取款或者转账等，可以延迟到子类中实现。
 *
 * @see <a href="http://c.biancheng.net/view/1376.html">模板方法模式（模板方法设计模式）详解</a>
 * @author dongrui
 * @date 2020/3/16 12:36
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        //调用模板方法
        tm.templateMethod();
    }
}
