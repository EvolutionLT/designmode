package com.designmode.adapter;

/**
 * @author Evolution
 * @title: Adapter
 * @projectName designmode
 * @description: TODO
 * @date 2019/4/1717:25
 */
public class Adapter extends Usber implements Ps2 {
      @Override
      public void isPs2() {
            isUsb();
      }
}
