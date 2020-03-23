package com.tengol.design.pattern.v1.behavioral.interpreter.demo1;

/**
 * TerminalExpression
 *
 * @author dongrui
 * @date 2020/3/23 13:42
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpet(String context) {
        if(context.contains(data)){
            return true;
        }else{
            return false;
        }
    }
}
