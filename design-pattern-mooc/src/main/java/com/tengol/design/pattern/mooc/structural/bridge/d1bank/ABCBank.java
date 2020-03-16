package com.tengol.design.pattern.mooc.structural.bridge.d1bank;

/**
 * ABCBank
 *
 * @author dongrui
 * @date 2020/2/20 16:26
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    void saveMoney(Double money) {
        System.out.println("打开中国农业银行账号");
        account.saveMoney(money);
    }
}
