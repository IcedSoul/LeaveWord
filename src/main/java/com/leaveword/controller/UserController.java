package com.leaveword.controller;

import com.leaveword.Utils.Response;
import com.leaveword.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 注册新用户
     *
     * @param userName
     * @param userPassword
     * @return
     */
    @PostMapping(value = "/userRegister")
    public Response userRegister(@RequestParam("userName")String userName,
                                 @RequestParam("userPassword")String userPassword){
        return userService.userRegister(userName,userPassword);
    }

    /**
     * 根据userId获取用户
     *
     * @param userId
     * @return
     */
    @PostMapping(value = "/getUser")
    public Response getUser(@RequestParam("userId")Integer userId){
        return userService.getUser(userId);
    }

    /**
     * 用户登录
     *
     * @param userName
     * @param userPassword
     * @return
     */
    @PostMapping(value = "/userLogin")
    public Response userLogin(@RequestParam("userName")String userName,
                              @RequestParam("userPassword")String userPassword){
        return userService.userLogin(userName,userPassword);
    }


}
