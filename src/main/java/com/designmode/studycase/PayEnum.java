package com.designmode.studycase;

/**
 * @author Evolution
 * @title: PayEnum
 * @projectName designmode
 * @description: TODO
 * @date 2019/5/2513:24
 */
public enum PayEnum {
      ALIPAY("com.designmode.studycase.Alipay"),
      WECHATPAY("com.designmode.studycase.WechatPay"),
      EBANKPAY("com.designmode.studycase.EbankPay");

      PayEnum(String className) {
            this.setClassName(className);
      }

      public String getClassName() {
            return className;
      }

      public void setClassName(String className) {
            this.className = className;
      }

      private String className;

}
