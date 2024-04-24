package com.dmitrii.ostapchuk.testProject.repository;

import com.dmitrii.ostapchuk.testProject.model.Order;
import com.dmitrii.ostapchuk.testProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUser (User user);
}
