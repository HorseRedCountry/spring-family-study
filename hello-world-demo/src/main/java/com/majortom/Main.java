package com.majortom;

import com.majortom.entity.User;
import com.majortom.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.majortom");
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        List<User> userList = userService.findUserList();
        userList.forEach(user -> System.out.println(user.getName() + ": " + user.getAge()));
    }
}