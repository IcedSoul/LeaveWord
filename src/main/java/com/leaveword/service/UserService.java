package com.leaveword.service;

import com.leaveword.Utils.Response;

public interface UserService {
    Response getUser(Integer userId);
    Response userRegister(String userName,String userPassword);
    Response userLogin(String userName,String userPassword);
}
