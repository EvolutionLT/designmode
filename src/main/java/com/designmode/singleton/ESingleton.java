package com.designmode.singleton;
/**
 * @author Evolution
 * @title: LazySingleton
 * @projectName designmode
 * @description: 单例模式--饿汉式单例类  在类初始化时，已经自行实例化
 * @date 2019/4/1523:58
 */
public class ESingleton {
     private static final ESingleton lazySingleton = new ESingleton();

     public ESingleton(){

    }

    public static ESingleton getInstance(){
         return  lazySingleton;
    }

}
