package com.designmode.studycase;

/**
 * @author Evolution
 * @title: EbankPay
 * @projectName designmode
 * @description: TODO
 * @date 2019/5/2511:31
 */
public class EbankPay implements PayStrategy{
      @Override
      public void pay(double total) {
            System.out.println("银行卡支付---"+total*1.2);
      }
}
