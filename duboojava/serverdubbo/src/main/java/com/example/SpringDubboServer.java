package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringDubboServer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("provide.xml");
        System.in.read();
    }
}
