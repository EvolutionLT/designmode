package com.designmode.proxy;

/**
 * @author Evolution
 * @title: ProxySubject
 * @projectName designmode
 * @description: TODO
 * @date 2019/4/1722:27
 */
public class ProxySubject implements Subject {
      private Subject subject;

      public ProxySubject(Subject subject) {
            this.subject = subject;
      }

      @Override
      public void visit() {
            subject.visit();
      }
}
