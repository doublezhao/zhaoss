package com.etc.controller;

import com.etc.service.UserService;
import com.etc.service.impl.UserServiceImpl;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @Author kzhao
 * @Date 10/25/2019 4:32 PM
 **/
@RestController
public class GetUser {

    @Autowired
    private UserServiceImpl us;

    @RequestMapping("/getUser")
    public String getUser() {
        return us.getUser().toString();
    }
    @RequestMapping("/getUser/{id}")
    public String getUserById(@PathVariable int id) {
        return us.getUser(id).toString();
    }

}
