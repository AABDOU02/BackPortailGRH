package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.ContratRep;
import com.arabsoft.ajir.entities.Contrat;
import java.util.Date;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class ContratController {
	
	
	@Autowired
	ContratRep contratRep;


	@CrossOrigin
	@GetMapping("/getcontrat")
	 public List<Contrat> getListCodPretPers(){
		
		return contratRep.getContrat();

	}
	
	
	@CrossOrigin
	@GetMapping("/getlistcontrat/{date1}/{date2}")
	 public List<Contrat> getListCodPret(@PathVariable String date1,@PathVariable String date2){
		
		
		
		return contratRep.getEndContrat(date1, date2);
		
		
	}
}
