package com.designmode.abstractfactory;

public class AbstractFactoryTest {
         public static  void  main(String args[]){
             AbstractFactory af =new AbstractFactory();
             food x =af.ClientCode("A");
             System.out.println(x);
         }


}
