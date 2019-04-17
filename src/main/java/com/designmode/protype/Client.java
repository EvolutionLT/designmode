package com.designmode.protype;

/**
 * @author Evolution
 * @title: Client
 * @projectName designmode
 * @description: TODO    http://www.cnblogs.com/java-my-life/archive/2012/04/11/2439387.html
 * @date 2019/4/1623:28
 */
public class Client {
      /**
       * 持有需要使用的原型接口对象
       */
      private  PrototypeI prototypeI;

      /**
       * 构造方法，传入需要使用的原型接口对象
       */
      public Client(PrototypeI prototype){
            this.prototypeI = prototype;
      }
      public void operation(PrototypeI example){
            //需要创建原型接口的对象
            PrototypeI copyPrototype = (PrototypeI) prototypeI.clone();

      }
}
