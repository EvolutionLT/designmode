package com.designmode.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evolution
 * @title: TestController
 * @projectName designmode
 * @description: TODO
 * @date 2021-04-14 16:21
 * @ltd：思为
 */
@RestController
@RequestMapping("/obdemo")
public class TestController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/register")
    public String register(String username) {
        userService.register(username);
        return "success";
    }
}
