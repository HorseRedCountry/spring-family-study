package com.majortom.dao;

import com.majortom.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/13 14:43
 **/
@Repository
public class UserDaoImpl {

    public List<User> findUserList(){
        return Collections.singletonList(new User("MajorTom",26));
    }
}
