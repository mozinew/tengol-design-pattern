package com.tengol.design.pattern.v1.behavioral.interpreter.structure;

/**
 * NonTerminalExpression
 * 非终结符表达式（Nonterminal Expression）角色：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
 *
 * @author dongrui
 * @date 2020/3/23 13:31
 */
public class NonTerminalExpression implements AbstractExpression{
    /**
     * 解析方法
     *
     * @param info
     */
    public void interprete(String info) {
        System.out.println("非终端解释器");
    }
}
