package com.dmitrii.ostapchuk.testProject.util;

import com.dmitrii.ostapchuk.testProject.model.Order;
import com.dmitrii.ostapchuk.testProject.model.dto.OrderTO;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class OrderMapper {

    public Order toEntity (OrderTO orderTO) {
        Order order = new Order();
        order.setName(orderTO.getName());
        order.setQuantity(orderTO.getQuantity());
        order.setAddress(orderTO.getAddress());
        order.setPhoneNumber(orderTO.getPhoneNumber());
        return order;
    }
}
