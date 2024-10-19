package com.example.demo.healthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.healthCare.model.*;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByMobile(String mobile);
}
