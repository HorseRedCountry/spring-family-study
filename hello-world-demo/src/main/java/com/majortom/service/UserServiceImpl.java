package com.majortom.service;

import com.majortom.dao.UserDaoImpl;
import com.majortom.entity.User;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/13 15:04
 **/
public class UserServiceImpl {

    private UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public List<User> findUserList(){
        return this.userDao.findUserList();
    }

    public void setUserDao(UserDaoImpl userDao){
        this.userDao=userDao;
    }

}
