package com.smart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
