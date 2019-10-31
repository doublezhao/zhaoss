package com.etc.service;

import com.etc.entity.Response.AddUserRes;
import com.etc.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kzhao
 * @Date 10/28/2019 2:04 PM
 **/

public interface UserService {
    public User getUser();
    public User getUser(int id);
    public AddUserRes addUser(Map map);
}
