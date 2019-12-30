package com.tengol.design.pattern.hello.respchain.logger;

/**
 * ErrorLogger
 *
 * @author dongrui
 * @date 2019/12/30 13:42
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Logger : " + message);
    }
}
