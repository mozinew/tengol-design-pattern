package com.tengol.design.pattern.hello.respchain.a1;


import lombok.*;

/**
 * 抽象处理器
 *
 * @author dongrui
 * @date 2019/12/30 11:30
 */
@NoArgsConstructor
@RequiredArgsConstructor
public abstract class Handler {
    //处理器名称
    @Getter
    @NonNull
    private String handlerName;

    //下一个处理器
    @Setter
    @Getter
    private Handler nextHandler;

    //处理方法
    public abstract void handleRequest();
}
