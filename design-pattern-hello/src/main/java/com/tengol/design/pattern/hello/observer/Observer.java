package com.tengol.design.pattern.hello.observer;

/**
 * Observer-抽象观察者
 *
 * @author dongrui
 * @date 2020/1/9 13:03
 */
public abstract class Observer {
    //被观察的目标
    protected Subject subject;
    //更新
    public abstract void update();
}
