package com.designmode.observer;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author evolution
 * @title: UserRegisterEvent
 * @projectName designmode
 * @description: TODO
 * @date 2021-04-14 15:45
 * @ltd：思为
 */
public class UserRegisterEvent extends ApplicationEvent {
    
    private String name;
    
    public UserRegisterEvent(Object source) {
        super(source);
    }
    
    public UserRegisterEvent(Object source, String username) {
        super(source);
        this.name = username;
    }
    
    public String getUsername() {
        return name;
    }
    
}
