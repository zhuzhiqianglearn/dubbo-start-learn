package com.example;

import org.apache.dubbo.config.*;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        //暴露服务
        //程序
        ApplicationConfig config=new ApplicationConfig("young-app");
        RegistryConfig registryConfig=new RegistryConfig();
        registryConfig.setAddress("nacos://127.0.0.1:8848");

        ReferenceConfig referenceConfig=new ReferenceConfig();
        referenceConfig.setApplication(config);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(UserServer.class);
//        referenceConfig.setUrl("dubbo://192.168.0.247:20881/com.example.UserServer?anyhost=true&application=sample-app&deprecated=false&dubbo=2.0.2&dynamic=true&generic=false&interface=com.example.UserServer&methods=getUser&pid=111812&release=2.7.4.1&side=provider&timestamp=1604907589555");

        UserServer userServer= (UserServer) referenceConfig.get();
        System.out.println(userServer.getUser(1).toString());

        System.in.read();

    }
}
