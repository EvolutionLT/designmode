package com.designmode.studycase;

/**
 * @author Evolution
 * @title: Client
 * @projectName designmode
 * @description: TODO
 * @date 2019/5/2515:14
 */
public class Client {
      public static void main(String[] args) throws Exception {

            String payStrategyParam = "ALIPAY";//Param from front end
            PayStrategy strategy = StrategyFactory.getStrategy(payStrategyParam);
            strategy.pay(12);
            payStrategyParam = "WECHATPAY";//Param from front end
            strategy = StrategyFactory.getStrategy(payStrategyParam);
            strategy.pay(12);
            payStrategyParam = "EBANKPAY";//Param from front end
            strategy = StrategyFactory.getStrategy(payStrategyParam);
            strategy.pay(12);
      }

}
