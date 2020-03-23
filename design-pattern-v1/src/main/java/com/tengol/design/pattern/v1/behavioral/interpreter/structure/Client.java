package com.tengol.design.pattern.v1.behavioral.interpreter.structure;

/**
 * Client
 * 客户端（Client）：主要任务是将需要分析的句子或表达式转换成使用解释器对象描述的抽象语法树，然后调用解释器的解释方法，当然也可以通过环境角色间接访问解释器的解释方法。
 *
 * @author dongrui
 * @date 2020/3/23 13:27
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.operation("a*3");
    }
}
