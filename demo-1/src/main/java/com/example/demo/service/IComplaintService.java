package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Complaint;

public interface IComplaintService {

	Complaint addComplaint(Complaint comp);
	List<Complaint> getAllComplaint();
}
