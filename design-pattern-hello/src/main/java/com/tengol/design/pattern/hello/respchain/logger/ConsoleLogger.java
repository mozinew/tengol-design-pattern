package com.tengol.design.pattern.hello.respchain.logger;

/**
 * 控制台处理器
 *
 * @author dongrui
 * @date 2019/12/30 13:38
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console logger : " + message);
    }
}
