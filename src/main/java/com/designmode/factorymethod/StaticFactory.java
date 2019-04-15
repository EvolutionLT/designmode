package com.designmode.factorymethod;

/**
 * @author Evolution
 * @title: StaticFactory
 * @projectName designmode
 * @description: 静态工厂类
 * @date 2019/4/1523:45
 */
public class StaticFactory {

      /**
      　　* @description: 无参构造器
      　　* @param ${tags}
      　　*/
      public StaticFactory(){

      }






      /**
       * 内部方法
       */

      public static food getA(){  return new A(); }
      public static food getB(){  return new B(); }
      public static food getC(){  return new C(); }

}
/**
 * 内部接口
 */
interface   food{}
class A implements food{}
class B implements food{}
class C implements food{}

class  Client{
      //客户端代码只需要将相应的参数传入即可得到对象
      //用户不需要了解工厂类内部的逻辑。
      public food get(String name){
            food x =null;
            if(name.equals("A")){
                  x=  StaticFactory.getA();
            }else if (name.equals("B")){
                  x=  StaticFactory.getB();
            }else{
                  x=  StaticFactory.getC();
            }
            return x;
      }
}