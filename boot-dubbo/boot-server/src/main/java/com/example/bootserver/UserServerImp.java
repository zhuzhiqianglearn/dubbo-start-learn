package com.example.bootserver;

import com.example.User;
import com.example.UserServer;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServerImp implements UserServer {
    @Override
    public User getUser(int id) {
        User user=new User();
        user.setId(id);
        user.setName("zzq");
        return user;
    }
}
