package com.example.regservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.regservice.model.User;


public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByEmail(String email);
}