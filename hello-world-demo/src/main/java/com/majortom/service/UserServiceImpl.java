package com.majortom.service;

import com.majortom.dao.UserDaoImpl;
import com.majortom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/13 15:04
 **/
@Service
public class UserServiceImpl {

    @Autowired
    private UserDaoImpl userDao;

    public List<User> findUserList() {
        return userDao.findUserList();
    }


}
