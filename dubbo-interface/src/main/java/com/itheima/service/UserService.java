package com.itheima.service;

import com.itheima.pojo.User;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/9/27 17:25
 * @company：CTTIC
 */
public interface UserService {
    public String sayHello();

    //查询用户
    public User findUserById(int id);

}
