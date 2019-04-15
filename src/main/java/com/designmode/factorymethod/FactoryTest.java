package com.designmode.factorymethod;

/**
 * @author Evolution
 * @title: FactoryTest
 * @projectName designmode
 * @description: TODO
 * @date 2019/4/1523:58
 */
public class FactoryTest {
      public  static void  main(String args[]){
            Client c =new Client();
            food  food=c.get("A");
            System.out.println(food);
      }
}
