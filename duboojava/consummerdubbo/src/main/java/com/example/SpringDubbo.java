package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringDubbo {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("classpath:consummer.xml");
        UserServer bean = classPathXmlApplicationContext.getBean(UserServer.class);
        User user = bean.getUser(233);
        System.out.println(user.toString());
        System.in.read();
    }
}
