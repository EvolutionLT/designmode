package com.designmode.studycase;

/**
 * @author Evolution
 * @title: StrategyFactory
 * @projectName designmode
 * @description: TODO 该工程类提供静态方法，巧妙地利用反射机制和枚举类的valueof方法，返回具体策略实例。


 * @date 2019/5/2515:07
 */
public class StrategyFactory {
      public static PayStrategy getStrategy(String strategyType) throws Exception {
            String className = PayEnum.valueOf(strategyType).getClassName();
            return (PayStrategy) Class.forName(className).newInstance();
      }
}
