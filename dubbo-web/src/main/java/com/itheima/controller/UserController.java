package com.itheima.controller;

import com.ithiema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/9/27 16:20
 * @company：CTTIC
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("hello");
        return userService.sayHello();
    }
}
