package com.majortom.config;

import com.majortom.aspect.LogAspect;
import com.majortom.dao.UserDaoImpl;
import com.majortom.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/17 10:42
 **/
@EnableAspectJAutoProxy
@Configuration
public class BeansConfig {

    @Bean("userDao")
    public UserDaoImpl userDao() {
        return new UserDaoImpl();
    }

    @Bean("userService")
    public UserServiceImpl userService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }

    @Bean("logAspect")
    public LogAspect logAspect() {
        return new LogAspect();
    }

}
