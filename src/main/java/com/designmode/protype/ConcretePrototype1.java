package com.designmode.protype;

/**
 * @author Evolution
 * @title: ConcretePrototype1
 * @projectName designmode
 * @description:  实例一 实现克隆接口对象
 * @date 2019/4/1623:22
 */
public class ConcretePrototype1 implements  PrototypeI {
      @Override
      public Object clone() {
            //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
            PrototypeI prototype = new ConcretePrototype1();
            return prototype;
      }
}
