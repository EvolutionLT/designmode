package com.designmode.Singleton;
/**
 * @author Evolution
 * @title: LazySingleton
 * @projectName designmode
 * @description: 单例模式--双重检测方式 在高并发情况下性能不高   建议不采用
 * @date 2019/4/15 23:58
 */
public class SynSingleton {
    private  static  SynSingleton synSingleton=null;

    public  SynSingleton(){ }

    public SynSingleton getInstance(){
        if (synSingleton ==null){
            synchronized (this){
                if (synSingleton==null){
                    synSingleton=new SynSingleton();
                }
            }
        }
        return  synSingleton;
    }
    //懒汉模式 写法 跟双重检查写法 差不多  ，一个是锁方法一个是锁对象
    public synchronized SynSingleton getInstance1(){
        if (synSingleton ==null){
                if (synSingleton==null){
                    synSingleton=new SynSingleton();
            }
        }
        return  synSingleton;
    }


}
