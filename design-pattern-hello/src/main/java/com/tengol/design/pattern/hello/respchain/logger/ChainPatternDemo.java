package com.tengol.design.pattern.hello.respchain.logger;

/**
 * ChainPatternDemo
 *
 * @author dongrui
 * @date 2019/12/30 13:43
 */
public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger chainLoggers = getChainLoggers();
        chainLoggers.logMessage(AbstractLogger.DEBUG,"This is debug info");
        System.out.println("----");
        chainLoggers.logMessage(AbstractLogger.INFO,"This is info info");
        System.out.println("----");
        chainLoggers.logMessage(AbstractLogger.ERROR,"This is error info");
    }


    public static AbstractLogger getChainLoggers(){
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
