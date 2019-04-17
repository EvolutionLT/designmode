package com.designmode.protype;

/**
 * @author Evolution
 * @title: Protype
 * @projectName designmode
 * @description: 原型模式就是讲一个对象作为原型，使用clone()方法来创建新的实例。 原型模式有两种表现形式：（1）简单形式、（2）登记形式，这两种表现形式仅仅是原型模式的不同实现。
 * @date 2019/4/16 22:42
 */
public class Protype  implements  Cloneable{
      private String name;

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      @Override
      protected Object clone()   {
            try {
                  return super.clone();
            } catch (CloneNotSupportedException e) {
                  e.printStackTrace();
            }finally {
                  return null;
            }
      }

      public static void main ( String[] args){
            Protype pro = new Protype();
            Protype pro1 = (Protype)pro.clone();
            System.out.println(pro);
            System.out.println(pro1);

      }
}
