package com.arrudafdc.crud_with_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arrudafdc.crud_with_spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}