package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, UserEntity> {
    public UserEntity getUserDetail(String id) {
        UserEntity userEntity = getById(id);

        return userEntity;
    }
}
