package com.dmitrii.ostapchuk.testProject.service;

import com.dmitrii.ostapchuk.testProject.model.Order;
import com.dmitrii.ostapchuk.testProject.model.User;

import java.util.List;

public interface OrderService {

    List<Order> findByUser(User user);

    void save (Order order);
}
