package com.itheima.service.impl;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/9/27 16:08
 * @company：CTTIC
 */
//@Service//springframework的Service注解 单体模式下 Bean的定义：放入IoC容器
@Service(version = "v2.0")//dubbo的Service注解 将ip 端口 路径 放入注册中心
public class UserServiceImpl2 implements UserService {
    public String sayHello() {
        return "Hello Dubbo!";
    }

    int i = 0;
    public User findUserById(int id) {
        System.out.println("new++++++++++++++++++++++++");
        i++;
        System.out.println("服务被调用了" + i);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //查询User对象
        return new User(id, "zhangan", "123");
    }
}
