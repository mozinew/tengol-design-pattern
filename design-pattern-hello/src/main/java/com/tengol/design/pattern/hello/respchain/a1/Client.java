package com.tengol.design.pattern.hello.respchain.a1;

/**
 * Client
 *
 * @author dongrui
 * @date 2019/12/30 11:43
 */
public class Client {
    public static void main(String[] args) {
        ConcreteHandler h1 = new ConcreteHandler("H1");
        ConcreteHandler h2 = new ConcreteHandler("H2");
        h1.setNextHandler(h2);
        //处理请求
        h1.handleRequest();
    }
}
