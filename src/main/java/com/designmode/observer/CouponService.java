package com.designmode.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @author evolution
 * @title: CouponService
 * @projectName designmode
 * @description: TODO
 * @date 2021-04-14 16:20
 * @ltd：思为
 */
@Service
public class CouponService implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("[addCoupon][给用户({}) 发放优惠劵]"+ userRegisterEvent.getUsername());;
    }
}
