package com.tengol.design.pattern.v1.behavioral.interpreter.demo1;

/**
 * AndExpression
 *
 * @author dongrui
 * @date 2020/3/23 13:45
 */
public class AndExpression implements Expression {
    private Expression exp1 = null;
    private Expression exp2 = null;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public boolean interpet(String context) {
        return exp1.interpet(context) && exp2.interpet(context);
    }
}
