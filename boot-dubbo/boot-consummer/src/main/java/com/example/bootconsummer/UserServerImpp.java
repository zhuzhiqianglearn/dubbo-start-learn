package com.example.bootconsummer;

import com.example.User;
import com.example.UserServer;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
public class UserServerImpp{
    @Reference
  private UserServer userServer;

    public User getUser(int id){
        return userServer.getUser(id);
    }
}
