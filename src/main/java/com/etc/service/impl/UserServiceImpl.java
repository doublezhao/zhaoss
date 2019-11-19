package com.etc.service.impl;
import java.util.Map;
import com.etc.dao.UserMapper;
import com.etc.entity.Response.AddUserRes;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author kzhao
 * @Date 10/28/2019 5:17 PM
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;

    public User getUser(){
        return userMapper.user();
    }
    public User getUser(int id){ return userMapper.getUserById(id);}
    public AddUserRes addUser(Map map){
        return AddUserRes ad;
    }
}
