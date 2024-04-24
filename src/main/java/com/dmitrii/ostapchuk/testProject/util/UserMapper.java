package com.dmitrii.ostapchuk.testProject.util;

import com.dmitrii.ostapchuk.testProject.model.User;
import com.dmitrii.ostapchuk.testProject.model.dto.UserTO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {
private final PasswordEncoder passwordEncoder;
    public User toEntity (UserTO userTO) {
        User user = new User();
        user.setLogin(userTO.getLogin());
        user.setPassword(passwordEncoder.encode(userTO.getPassword()));
        user.setFullName(userTO.getFullName());
        user.setAvatarRef(userTO.getAvatarRef());
        return user;
    }

}
