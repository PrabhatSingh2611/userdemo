package com.example.learning.jpa.jpademo.services;

import com.example.learning.jpa.jpademo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
