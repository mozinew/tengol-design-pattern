package com.tengol.design.pattern.v1.template.method.principle2;

/**
 * HookAbstractClass
 *
 * @author dongrui
 * @date 2020/3/16 13:58
 */
public abstract class HookAbstractClass {
    public void templateMethod(){
        abstractMethod1();
        hookMethod1();
        if(hookMethod2()){
            specificMethod();
        }
        abstractMethod2();
    }

    public void specificMethod(){
        System.out.println("抽象类的具体方法被调用了......");
    }

    /**
     * 钩子方法 1
     */
    public void hookMethod1(){};

    /**
     * 钩子方法 2
     * @return 默认返回 true
     */
    public boolean hookMethod2(){
        return true;
    }

    /**
     * 抽象方法 1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法 2
     */
    public abstract void abstractMethod2();
}
