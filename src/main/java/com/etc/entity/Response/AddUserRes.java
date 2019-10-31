package com.etc.entity.Response;

import lombok.Data;
import lombok.ToString;

/**
 * @Author kzhao
 * @Date 10/31/2019 5:07 PM
 **/

@ToString
@Data
public class AddUserRes {
    private String name;
    private String realName;
    private String passWord;
}

