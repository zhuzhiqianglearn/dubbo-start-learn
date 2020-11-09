package com.example;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

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
        ApplicationConfig config=new ApplicationConfig("sample-app");
        //协议（duboo协议） protocol
        ProtocolConfig protocolConfig=new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(-1);//20880
        //注册中心
//        RegistryConfig registryConfig=new RegistryConfig(RegistryConfig.NO_AVAILABLE);
        RegistryConfig registryConfig=new RegistryConfig("nacos://127.0.0.1:8848");
        //server
        ServiceConfig serviceConfig=new ServiceConfig();
        serviceConfig.setInterface(UserServer.class);
        serviceConfig.setRef(new UserServerImp());

        //关联
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setApplication(config);

        serviceConfig.export();

        System.out.println("服务已经暴露");
        System.in.read();
    }
}
