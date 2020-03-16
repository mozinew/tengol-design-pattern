package com.tengol.design.pattern.v1.template.method.principle2;

/**
 * HookTemplateMethod - 带有钩子方法的模板方法模式
 *
 * @author dongrui
 * @date 2020/3/16 13:58
 */
public class HookTemplateMethod {
    public static void main(String[] args) {
        HookAbstractClass hook = new HookConcreteClass();
        hook.templateMethod();
    }
}
