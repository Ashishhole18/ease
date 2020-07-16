package com.ease.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ease.demo.entity.UserFeedback;

public interface UserFeedbackRepo extends JpaRepository<UserFeedback, Integer> {

}
