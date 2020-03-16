package com.tengol.design.pattern.mooc.structural.bridge.d1bank;

/**
 * DepositAccount - 定期存款账户
 *
 * @author dongrui
 * @date 2020/2/20 16:23
 */
public class DepositAccount implements Account {
    public void saveMoney(Double money) {
        System.out.println("打开定期账号");
        System.out.printf("存款：%f 元\n", money);
    }

    public void printAccountType() {
        System.out.println("这是一个定期账号");
    }
}
