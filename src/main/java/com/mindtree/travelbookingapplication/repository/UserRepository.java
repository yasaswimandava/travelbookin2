package com.mindtree.travelbookingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.travelbookingapplication.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
