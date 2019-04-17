package com.designmode.protype;

/**
 * @author Evolution
 * @title: ConcretePrototype2
 * @projectName designmode
 * @description: 实例二 实现克隆接口对象
 * @date 2019/4/1623:27
 */
public class ConcretePrototype2  implements  PrototypeI{

      @Override
      public Object clone() {
            PrototypeI prototypeI=new ConcretePrototype2();
            return prototypeI;
      }
}
