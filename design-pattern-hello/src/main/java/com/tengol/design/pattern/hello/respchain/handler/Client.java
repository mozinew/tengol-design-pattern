package com.tengol.design.pattern.hello.respchain.handler;

/**
 * 客户端
 *
 * @author dongrui
 * @date 2019/12/30 11:43
 */
public class Client {
    public static void main(String[] args) {
        //定义请求
        MyRequest request = new MyRequest("HTTP请求",1);
        //定义处理器
        ConcreteHandler h1 = new ConcreteHandler("H1");
        ConcreteHandler h2 = new ConcreteHandler("H2");
        h1.setNextHandler(h2);
        //处理请求
        h1.handleRequest(request);
    }
}
