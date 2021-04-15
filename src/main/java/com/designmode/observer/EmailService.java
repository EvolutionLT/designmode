package com.designmode.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @author evolution
 * @title: EmailService
 * @projectName designmode
 * @description: TODO
 * @date 2021-04-14 16:18
 * @ltd：思为
 */
@Service
public class EmailService implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("[onApplicationEvent][给用户({}) 发送邮件]"+ userRegisterEvent.getUsername());;
    }
}
