package com.sw409.coviddemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.sw409.coviddemo.controllers.ArrayList;
import com.sw409.coviddemo.models.Resident;
import com.sw409.coviddemo.repositories.ResidentRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResidentService {
	
	@Autowired
	ResidentRepository resRepo;
	
	List<Resident> resList = new ArrayList<>();
	
	//CREATE --> POST
	public Resident addResident(Resident res) {
		resList.add(res);
		return resRepo.save(res);
	}
	
	//READ --> GET
	public ArrayList<Resident> getAllResidents(){
		return (ArrayList<Resident>) resRepo.findAll();
	}
}
