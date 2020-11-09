package com.example;

public class UserServerImp implements UserServer{
    @Override
    public User getUser(int id) {
        User user=new User();
        user.setId(id);
        user.setName("zzq");
        return user;
    }
}
