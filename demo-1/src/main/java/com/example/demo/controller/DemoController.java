package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Complaint;
import com.example.demo.service.ComplainServiceImpl;

@RestController
public class DemoController {
	
	@GetMapping("/v2")
	public String getname() {
		return "sandipa";
	}

	@Autowired
	ComplainServiceImpl compServ;
	
	@PostMapping("/complaint/add")
	public ResponseEntity<Complaint> addComplaint(@RequestBody Complaint complaint) {
		Complaint ck =compServ.addComplaint(complaint);
		return new ResponseEntity<>(ck, HttpStatus.CREATED); 
	}
}
