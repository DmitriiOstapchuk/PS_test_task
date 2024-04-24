package com.dmitrii.ostapchuk.testProject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderTO {

    private String name;
    private int quantity;
    private String address;
    private String phoneNumber;
}
