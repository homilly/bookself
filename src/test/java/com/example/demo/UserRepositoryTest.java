package com.example.demo;

import Common.Repository.UserRepository;

import javax.annotation.Resource;

public class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    public long getUser() {
        long phoneNum = 123;
        String userName = "xiaomi";
        userRepository.findUserByPhoneNum(phoneNum);
        userRepository.findUserByUsername(userName);

        return 1;
    }
}
