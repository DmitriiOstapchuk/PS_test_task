package com.dmitrii.ostapchuk.testProject.controller;

import com.dmitrii.ostapchuk.testProject.model.dto.UserTO;
import com.dmitrii.ostapchuk.testProject.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }


    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("userTO", new UserTO());
        return "register";
    }

    @PostMapping("/register")
    public String registerNewUser(@Valid @ModelAttribute("userTO") UserTO userTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        if (!userTO.getPassword().equals(userTO.getRepeatPassword())) {
            bindingResult.rejectValue("password", "", "You entered two different passwords. Please try again.");
            return "register";
        }

        userService.create(userTO);
        return "redirect:/login";
    }
}
