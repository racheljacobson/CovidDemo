package com.sw409.coviddemo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.coviddemo.models.Resident;
import com.sw409.coviddemo.services.ResidentService;

@RestController
public class ResidentController {
	@Autowired
	ResidentService resService;
	//CREATE object --> POST mapping
	@PostMapping("api/resident")
	public Resident addResident(@RequestBody Resident res) {
		return resService.addResident(res);
	}
	
	//READ --> GET mapping 
	@GetMapping("api/resident")
	public ArrayList<Resident> getAllResidents() {
		return resService.getAllResidents();
	}

}
