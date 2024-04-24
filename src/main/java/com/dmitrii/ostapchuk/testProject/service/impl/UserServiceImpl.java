package com.dmitrii.ostapchuk.testProject.service.impl;

import com.dmitrii.ostapchuk.testProject.model.User;
import com.dmitrii.ostapchuk.testProject.model.dto.UserTO;
import com.dmitrii.ostapchuk.testProject.repository.UserRepository;
import com.dmitrii.ostapchuk.testProject.service.UserService;
import com.dmitrii.ostapchuk.testProject.util.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public void create(UserTO userTO) {
        userRepository.save(userMapper.toEntity(userTO));
    }
}
