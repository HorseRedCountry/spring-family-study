package com.majortom.service;

import com.majortom.dao.UserDaoImpl;
import com.majortom.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Resource
    private UserDaoImpl userDao;

    public List<User> findUserList() {
        return userDao.findUserList();
    }


}
