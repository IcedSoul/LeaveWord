package com.leaveword.service;

import com.leaveword.utils.Response;

/**
 * @author guoxiaofeng
 */
public interface UserService {
    /**
     * GetUser by userId
     * @param userId userId
     * @return response
     */
    Response getUser(Integer userId);

    /**
     * Register
     * @param userName userName
     * @param userPassword password
     * @return response
     */
    Response userRegister(String userName,String userPassword);

    /**
     * login
     * @param userName userName
     * @param userPassword password
     * @return response
     */
    Response userLogin(String userName,String userPassword);
}
