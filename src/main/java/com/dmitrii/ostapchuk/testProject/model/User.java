package com.dmitrii.ostapchuk.testProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends HasSystemFields{

    @Column (unique = true, nullable = false)
    private String login;

    @Column (nullable = false)
    private String password;

    @Column (name = "full_name", nullable = false)
    private String fullName;

    @Column (name = "avatar_ref")
    private String avatarRef;

    @OneToMany(mappedBy = "userId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;
}
