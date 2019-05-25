package com.designmode.studycase;

/**
 * @author Evolution
 * @title: WechatPay
 * @projectName designmode
 * @description: TODO
 * @date 2019/5/2511:27
 */
public class WechatPay  implements PayStrategy{
      @Override
      public void pay(double total) {
            System.out.println("微信支付-------"+total*1.1 );
      }
}
