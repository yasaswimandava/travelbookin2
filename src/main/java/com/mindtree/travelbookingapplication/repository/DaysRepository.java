package com.mindtree.travelbookingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.travelbookingapplication.entity.Days;

@Repository
public interface DaysRepository extends JpaRepository<Days, Long>
{

}
