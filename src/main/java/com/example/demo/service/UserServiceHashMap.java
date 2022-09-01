package com.example.demo.service;

import com.example.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceHashMap implements UserService {
    @Override
    public User create(User user){
        return user;
    }
    @Override
    public User findById( String id ){

    }

    @Override
    public List<User> getAll(){

    }

    @Override
    void deleteById( String id ){

    }

    @Override
    public User update( User user, String userId ){

    }
}
