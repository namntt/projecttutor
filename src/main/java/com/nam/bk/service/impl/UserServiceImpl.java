package com.nam.bk.service.impl;

import com.nam.bk.dto.UserDTO;
import com.nam.bk.entity.User;
import com.nam.bk.repository.UserRepository;
import com.nam.bk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Lists;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

//    @Override
//    public List<UserDTO> getAllUser() {
//        List<User> userList=us
//        return userRepository.findAll();
//    }
}
