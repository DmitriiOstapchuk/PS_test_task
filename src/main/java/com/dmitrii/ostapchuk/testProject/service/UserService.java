package com.dmitrii.ostapchuk.testProject.service;

import com.dmitrii.ostapchuk.testProject.model.dto.UserTO;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {

    @Transactional
    void create (UserTO userTO);
}
