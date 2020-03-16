package com.tengol.design.pattern.mooc.structural.bridge.d1bank;

/**
 * ICBCBank
 *
 * @author dongrui
 * @date 2020/2/20 16:27
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    void saveMoney(Double money) {
        System.out.println("打开中国工商银行账号");
        this.account.saveMoney(money);
    }
}
