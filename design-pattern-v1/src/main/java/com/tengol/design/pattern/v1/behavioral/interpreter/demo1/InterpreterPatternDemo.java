package com.tengol.design.pattern.v1.behavioral.interpreter.demo1;

/**
 * InterpreterPatternDemo
 *
 * @author dongrui
 * @date 2020/3/23 13:47
 */
public class InterpreterPatternDemo {
    public static Expression getMaleExpression(){
        TerminalExpression robert = new TerminalExpression("Robert");
        TerminalExpression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }

    public static Expression getMarriedWomanExpression(){
        TerminalExpression julie = new TerminalExpression("Julie");
        TerminalExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomanExpression();

        System.out.println("John is male ? " + isMale.interpet("John"));
        System.out.println("Julie is a married women ? " + isMarriedWomen.interpet("Married Julie"));

    }
}
