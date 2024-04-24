package com.dmitrii.ostapchuk.testProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@MappedSuperclass
@Data
public abstract class HasSystemFields {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
