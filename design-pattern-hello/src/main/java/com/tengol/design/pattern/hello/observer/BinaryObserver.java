package com.tengol.design.pattern.hello.observer;

/**
 * BinaryObserver
 *
 * @author dongrui
 * @date 2020/1/9 13:05
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        //向被观察目标申请注册，告诉它，我要观察你
        this.subject.register(this);
    }

    @Override
    public void update() {
        //监测到目标对象的最新状态
        int state = subject.getState();
        //更改
        System.out.println("Binary String : " + Integer.toBinaryString(state));

    }
}
