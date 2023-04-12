package com.Validation.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Validation.example.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserId(int id);

}
