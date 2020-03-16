package com.tengol.design.pattern.mooc.structural.bridge.d1bank;

/**
 * Account - 账户接口
 *
 * @author dongrui
 * @date 2020/2/20 16:20
 */
public interface Account {
    void saveMoney(Double money);
    void printAccountType();
}
