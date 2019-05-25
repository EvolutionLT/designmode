package com.designmode.studycase;

/**
 * @author Evolution
 * @title: Alipay
 * @projectName designmode
 * @description: TODO
 * @date 2019/5/2511:24
 */
public class Alipay implements PayStrategy {
      @Override
      public void pay(double total) {
            System.out.println("支付宝支付！！！ 结果是："+total*0.9);

      }
}
