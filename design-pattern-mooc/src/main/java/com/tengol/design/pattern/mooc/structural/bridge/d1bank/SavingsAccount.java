package com.tengol.design.pattern.mooc.structural.bridge.d1bank;

/**
 * SavingsAccount - 活期存储账户
 *
 * @author dongrui
 * @date 2020/2/20 16:24
 */
public class SavingsAccount implements Account {
    public void saveMoney(Double money) {
        System.out.println("打开活期账号");
        System.out.printf("存款：%f 元\n", money);
    }

    public void printAccountType() {
        System.out.println("这是一个活期账号");
    }
}
