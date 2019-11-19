package com.etc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.etc.entity.Response.AddUserRes;
import com.etc.service.impl.UserServiceImpl;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author kzhao
 * @Date 10/25/2019 4:32 PM
 **/
@RestController
public class User {

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

    @RequestMapping(value="/getUser/ById",method = RequestMethod.POST)
    public String getUserByIdPost(HttpServletRequest  request) {
        Map<String,Object> para =new HashMap<>();
        para.put("id",request.getParameter("id"));
        System.out.print(request.getParameter("id"));
        return us.getUser(Integer.parseInt(request.getParameter("id"))).toString();
    }

    @RequestMapping(value="/addUser",method= RequestMethod.POST)
    public AddUserRes addUser(HttpServletRequest  request){
        Map<String,Object> para =new HashMap<>();
        para.put("id",request.getParameter("id"));
        return us.addUser(para);
    }

}
