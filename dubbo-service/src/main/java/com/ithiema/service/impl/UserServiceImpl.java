package com.ithiema.service.impl;

import com.ithiema.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/9/27 16:08
 * @company：CTTIC
 */
@Service
public class UserServiceImpl implements UserService {
    public String sayHello() {
        return "Hello Dubbo!";
    }
}
