package com.dmitrii.ostapchuk.testProject.repository;

import com.dmitrii.ostapchuk.testProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin (String login);
}
