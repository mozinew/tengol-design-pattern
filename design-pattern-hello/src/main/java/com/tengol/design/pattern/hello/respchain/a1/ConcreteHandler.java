package com.tengol.design.pattern.hello.respchain.a1;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 具体处理器
 *
 * @author dongrui
 * @date 2019/12/30 11:40
 */
@NoArgsConstructor
public class ConcreteHandler extends Handler {
    //处理器名称
    @Getter
    private String handlerName;

    public ConcreteHandler(String handlerName) {
        super(handlerName);
        this.handlerName = handlerName;
    }

    @Override
    public void handleRequest() {
        System.out.println(this.handlerName + " 处理器正在处理请求...");
        //判断是否存在下一个处理器
        Handler nextHandler = getNextHandler();
        if (nextHandler != null) {
            System.out.println(this.handlerName + "处理完毕，交由下一个处理器：" + nextHandler.getHandlerName());
            //存在则调用下一个处理器
            nextHandler.handleRequest();
        } else {

            System.out.println(this.handlerName + "处理完毕");
        }
    }
}
