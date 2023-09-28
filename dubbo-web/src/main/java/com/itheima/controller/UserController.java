package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
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

//    @Autowired//本地注入
    /*
     * 1. 从zookeeper注册中心获取userService的访问url
     * 2. 进行远程调用RPC
     * 3. 将结果封装为一个代理对象。给变量赋值
     **/
    @Reference(version = "v2.0")//远程注入
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("hello");
        return userService.sayHello();
    }

    int i = 1;
    @RequestMapping("/find")
    public User findUserById(){
        new Thread(()->{
            while (true){
                System.out.println(i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        return userService.findUserById(1);
    }
}
