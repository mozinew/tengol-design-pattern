package com.tengol.design.pattern.mooc.structural.bridge.d1bank;

/**
 * Bank - 银行抽象类，以组合方式调用存款账户接口
 *
 * @author dongrui
 * @date 2020/2/20 16:25
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract void saveMoney(Double money);
}
