package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Complaint;
import com.example.demo.repo.ComplaintRepo;


@Service
public class ComplainServiceImpl implements IComplaintService{

	@Autowired
	ComplaintRepo compRepo;
	
	@Override
	public Complaint addComplaint(Complaint comp) {
		return compRepo.save(comp);
	}

	@Override
	public List<Complaint> getAllComplaint() {
		return compRepo.findAll();
	}
}
