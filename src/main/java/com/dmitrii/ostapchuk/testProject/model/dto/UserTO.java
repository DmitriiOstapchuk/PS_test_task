package com.dmitrii.ostapchuk.testProject.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTO {
    @NotBlank
    private String login;

    @NotBlank
    private String password;

    @NotBlank
    private String repeatPassword;

    @NotBlank
    private String fullName;

    @NotBlank
    private String avatarRef;
}
