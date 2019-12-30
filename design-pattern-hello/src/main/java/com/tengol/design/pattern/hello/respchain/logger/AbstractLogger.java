package com.tengol.design.pattern.hello.respchain.logger;

import lombok.Setter;

/**
 * 抽象日志处理器
 *
 * @author dongrui
 * @date 2019/12/30 12:08
 */
public abstract class AbstractLogger {
    //定义日志级别
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;

    //设定的日志级别
    protected int level;

    //责任链下一个元素
    @Setter
    private AbstractLogger nextLogger;

    //不同级别的记录方法不一样,这里给一个抽象的记录方法
    protected abstract void write(String message);

    //调用责任链处理器的记录方法.并且判断下一个责任链元素是否存在,若存在,则执行下一个方法.
    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }


}
