package com.dmitrii.ostapchuk.testProject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthTO {

    private String login;
    private String password;
}
