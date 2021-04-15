package com.designmode.observer;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * @author evolution
 * @title: UserService
 * @projectName designmode
 * @description: TODO
 * @date 2021-04-14 16:02
 * @ltd：思为
 */
@Service
public class UserService implements ApplicationEventPublisherAware {
    
    //private Logger logger = (Logger) LoggerFactory.getLogger(getClass());
    
    private ApplicationEventPublisher applicationEventPublisher;
    
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
    
    public void register(String username) {
        // ... 执行注册逻辑
        System.out.println("[register][执行用户({}) 的注册逻辑]"+ username);
        
        // <2> ... 发布
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, username));
    }
}
