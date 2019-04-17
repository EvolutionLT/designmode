package com.designmode.protype;

/**
 * @author Evolution
 * @title: PrototypeI
 * @projectName designmode
 * @description: 接口
 * @date 2019/4/1623:20
 */
public interface PrototypeI {
      /**
       * 克隆自身的方法
       * @return 一个从自身克隆出来的对象
       */
   public Object clone();
}
