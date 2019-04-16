package com.designmode.abstractfactory;
/**
 * @author Evolution
 * @title: FactoryTest
 * @projectName designmode
 * @description: 抽象工厂模式
 * @date 2019/4/1523:58
 */



interface  food{}
class A implements food{}
class B implements food{}
interface product{
     food get();
}

class FactoryForA implements product{
    @Override
    public food get() {
        return new A();
    }
}
class FactoryForB implements product {
    @Override
    public food get() {
        return new B();
    }
}

public class AbstractFactory {
    public food ClientCode(String name){
        food x= new FactoryForA().get();
        x = new FactoryForB().get();
    return x;
    }
}
