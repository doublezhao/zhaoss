package com.etc.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @Author kzhao
 * @Date 10/28/2019 2:06 PM
 **/
@Data
@ToString
public class User {
    private int id;
    private String userName;
    private String passWord;
    private String realName;
}
