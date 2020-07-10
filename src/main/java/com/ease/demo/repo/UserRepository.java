package com.ease.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ease.demo.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
