package com.dmitrii.ostapchuk.testProject.controller;

import com.dmitrii.ostapchuk.testProject.model.Order;
import com.dmitrii.ostapchuk.testProject.model.User;
import com.dmitrii.ostapchuk.testProject.model.dto.OrderTO;
import com.dmitrii.ostapchuk.testProject.repository.OrderRepository;
import com.dmitrii.ostapchuk.testProject.repository.UserRepository;
import com.dmitrii.ostapchuk.testProject.util.OrderMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final UserRepository userRepository;
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @GetMapping
    public String findByUser(Model model, Principal principal) {
        User user = userRepository.findByLogin(principal.getName()).get();
        model.addAttribute("authorizedUser", user);
        model.addAttribute("orders", orderRepository.findByUser(user));
        model.addAttribute("newOrder", new OrderTO());
        return "orders";
    }

    @PostMapping
    public String newOrder (@Valid @ModelAttribute("newOrder") OrderTO orderTO, Principal principal) {
        User user = userRepository.findByLogin(principal.getName()).get();
        Order order = orderMapper.toEntity(orderTO);
        order.setUserId(user.getId());
        orderRepository.save(order);
        return "redirect:/";
    }
}
