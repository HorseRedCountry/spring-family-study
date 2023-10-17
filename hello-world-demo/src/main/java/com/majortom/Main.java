package com.majortom;

import com.majortom.config.BeansConfig;
import com.majortom.entity.User;
import com.majortom.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/13 14:35
 **/
public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml",
//                "daos.xml", "services.xml");
//        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        List<User> userList = userService.findUserList();
        userList.forEach(user -> System.out.println(user.getName() + ": " + user.getAge()));
    }
}