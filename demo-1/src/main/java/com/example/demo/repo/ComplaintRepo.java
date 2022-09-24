package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Complaint;

@Repository
public interface ComplaintRepo extends JpaRepository<Complaint,Integer> {
	
	
}
