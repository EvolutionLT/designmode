package com.designmode.singleton;
/**
 * @author Evolution
 * @title: InnerClassSingleton
 * @projectName designmode
 * @description:
 * 相比于懒汉以及饿汉模式，静态内部类模式没有一个较为官方的名称，这只是我个人的称谓。但是却是许多人更为推荐的一种形式。
 * 顾名思义，这种模式使用了一个私有的静态内部类，来存储外部类的单例，这种静态内部类，一般称为 Holder。
 * 而利用静态内部类的特性，外部类的 getinstance() 方法，可以直接指向 Holder 持有的对象。
 * @date 2019/4/1523:58
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
        if (SingletonHolder.innerClassSingleton != null) {
                         throw new IllegalStateException();
                    }
    }

      private static class SingletonHolder{
      private static InnerClassSingleton innerClassSingleton =new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
          return  SingletonHolder.innerClassSingleton;
    }
}
