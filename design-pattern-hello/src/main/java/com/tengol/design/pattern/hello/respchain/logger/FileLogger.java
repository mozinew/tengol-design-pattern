package com.tengol.design.pattern.hello.respchain.logger;

/**
 * FileLogger
 *
 * @author dongrui
 * @date 2019/12/30 13:41
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File Logger : " + message);
    }
}
