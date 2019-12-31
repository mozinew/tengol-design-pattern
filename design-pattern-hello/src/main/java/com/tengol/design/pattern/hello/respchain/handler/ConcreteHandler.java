package com.tengol.design.pattern.hello.respchain.handler;

import lombok.NoArgsConstructor;

/**
 * 具体处理器
 *
 * @author dongrui
 * @date 2019/12/30 11:40
 */
@NoArgsConstructor
public class ConcreteHandler extends Handler {

    ConcreteHandler(String handlerName) {
        super(handlerName);
    }

    /**
     * 处理请求
     */
    @Override
    public void handleRequest(MyRequest request) {
        System.out.println(this.getHandlerName() + " 处理器正在处理请求: " + request.getName());

        //处理请求
        System.out.println(this.getHandlerName() + " 处理完毕");

        //判断是否存在下一个处理器
        Handler nextHandler = getNextHandler();
        if (nextHandler != null) {
            System.out.println("请求交由下一个处理器：" + nextHandler.getHandlerName());
            nextHandler.handleRequest(request);
        }
    }
}
