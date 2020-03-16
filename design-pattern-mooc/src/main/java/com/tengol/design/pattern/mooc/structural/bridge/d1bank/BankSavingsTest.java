package com.tengol.design.pattern.mooc.structural.bridge.d1bank;

/**
 * 银行存款业务场景：
 * 小张有一笔钱想用于理财投资，为此做了一番功课了解到，现在有中国工商银行、中国农业银行两家银行，
 * 每家银行都提供了活期存储和定期存款，活期存款存取灵活但利息低，定期存款利息相对较高但存取不够灵活，
 * 同时了解到中国工商银行的定期存款利率相对较高，中国农业银行的活期存款利率相对较高，
 * 于是小张计划将投资款项分为2部分，一部分存储到中国工商银行的定期账户，一部分存储到中国农业银行的活期账户。
 *
 * 请根据以上业务设计一个银行存款系统，提供灵活的配置功能。
 *
 * @author dongrui
 * @date 2020/2/20 16:28
 */
public class BankSavingsTest {

    public static void main(String[] args) {
        //定期账号和活期账号
        Account depositAccount = new DepositAccount();
        Account savingsAccount = new SavingsAccount();
        //工商银行定期账号
        Bank icbc = new ICBCBank(depositAccount);
        icbc.saveMoney(20000.00);
        System.out.println("------");
        //农业银行活期账号
        Bank abc = new ABCBank(savingsAccount);
        abc.saveMoney(3000.00);
    }
}
