package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.CompetenceDetRep;
import com.arabsoft.ajir.dao.CompetenceRep;
import com.arabsoft.ajir.dao.CompetencesReqRep;
import com.arabsoft.ajir.dao.NatCompetanceRep;
import com.arabsoft.ajir.entities.CessionPers;
import com.arabsoft.ajir.entities.Competence;
import com.arabsoft.ajir.entities.CompetenceDet;
import com.arabsoft.ajir.entities.CompetencesReq;
import com.arabsoft.ajir.entities.NatCompetance;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class CompetencesController {
	
	@Autowired
	CompetenceDetRep competenceDetRep;
	
	@Autowired
	CompetencesReqRep competencesReqRep;
	
	
	@Autowired
	NatCompetanceRep natCompetenceRep;
	
	
	
	@CrossOrigin
	@GetMapping("/getcomptence/{matPers}")
	 public List<CompetenceDet> getListCodPretPers(@PathVariable String matPers){
		
		
		
		return competenceDetRep.getCompetenceServ(matPers);
		
		
	}
	
	@CrossOrigin
	@GetMapping("/getcomptencereq/{matPers}")
	 public List<CompetencesReq> getListCompetencesReq(@PathVariable String matPers){

		return competencesReqRep.getCompetenceRequise(matPers);

	}
	
	
	@CrossOrigin
	@GetMapping("/getcomptencereqpers/{matPers}/{matPersAgent}")
	 public List<CompetencesReq> getListCompetencesReqPers(@PathVariable String matPers,@PathVariable String matPersAgent){

		return competencesReqRep.getCompetenceRequisePers(matPers,matPersAgent);

	}
	
	
	@GetMapping("/getallcompetence")
	public List<NatCompetance>  getall(){
			return  natCompetenceRep.findAll();
		}
	
	
	
}
