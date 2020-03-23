package com.tengol.design.pattern.v1.behavioral.interpreter.structure;

/**
 * TerminalExpression
 *  终结符表达式（Terminal    Expression）角色：是抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。
 *
 * @author dongrui
 * @date 2020/3/23 13:30
 */
public class TerminalExpression implements AbstractExpression {
    /**
     * 解析方法
     */
    public void interprete(String info) {
        System.out.println("终端解释器");
    }
}
