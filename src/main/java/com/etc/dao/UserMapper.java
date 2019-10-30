package com.etc.dao;

import com.etc.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author kzhao
 * @Date 10/28/2019 2:06 PM
 **/
@Repository
public interface UserMapper {
    User user();
    User getUserById(int id);
}
