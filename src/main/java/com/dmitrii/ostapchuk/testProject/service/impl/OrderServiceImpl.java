package com.dmitrii.ostapchuk.testProject.service.impl;

import com.dmitrii.ostapchuk.testProject.model.Order;
import com.dmitrii.ostapchuk.testProject.model.User;
import com.dmitrii.ostapchuk.testProject.repository.OrderRepository;
import com.dmitrii.ostapchuk.testProject.repository.UserRepository;
import com.dmitrii.ostapchuk.testProject.service.OrderService;
import com.dmitrii.ostapchuk.testProject.util.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public List<Order> findByUser (User user) {
        return orderRepository.findByUser(user);
    }

    public void save (Order order) {
        orderRepository.save(order);
    }
}
