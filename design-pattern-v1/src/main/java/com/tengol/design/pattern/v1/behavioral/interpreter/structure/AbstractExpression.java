package com.tengol.design.pattern.v1.behavioral.interpreter.structure;

/**
 * AbstractExpression
 * 抽象表达式（Abstract Expression）角色：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()。
 *
 * @author dongrui
 * @date 2020/3/23 13:28
 */
public interface AbstractExpression {
    /**
     * 解析方法
     */
    void interprete(String info);
}
