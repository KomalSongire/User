package com.user.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
