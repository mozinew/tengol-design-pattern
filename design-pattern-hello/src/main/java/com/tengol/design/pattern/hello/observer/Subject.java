package com.tengol.design.pattern.hello.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察的目标
 *
 * @author dongrui
 * @date 2020/1/9 13:02
 */
public class Subject {
    //观察者集合（谁在观察我）
    private List<Observer> observerList = new ArrayList<Observer>();
    //被观察者的状态
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //通知所有的观察者
        notifyAllObservers();
    }

    public void notifyAllObservers(){
        //观察者接到状态变化的通知，开始更新自己的状态
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    /**
     * 告诉被观察目标，观察赵请求观察你
     *
     * @param observer 观察者
     */
    public void register(Observer observer){
        observerList.add(observer);
    }
}
