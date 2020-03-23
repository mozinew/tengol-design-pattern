package com.tengol.design.pattern.v1.behavioral.interpreter.structure;

/**
 * Context
 * 环境（Context）角色：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 *
 * @author dongrui
 * @date 2020/3/23 13:35
 */
public class Context {
    private AbstractExpression expression;

    public Context() {
        //数据化数据
    }

    public void operation(String info) {
        //调用相关表达式类的解释方法
    }
}
