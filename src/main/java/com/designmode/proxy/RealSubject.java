package com.designmode.proxy;

/**
 * @author Evolution
 * @title: RealSubject
 * @projectName designmode
 * @description: TODO
 * @date 2019/4/1722:26
 */
public class RealSubject implements Subject {
      private String name = "Evolution";
      @Override
      public void visit() {
            System.out.println(name);
      }
}
