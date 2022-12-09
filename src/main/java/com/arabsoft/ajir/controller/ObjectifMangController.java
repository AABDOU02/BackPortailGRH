package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.ObjectifAgentDetPmRep;
import com.arabsoft.ajir.dao.ObjectifAgentRep;
import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.entities.ObjectifAgent;
import com.arabsoft.ajir.entities.ObjectifAgentDetPm;
import com.arabsoft.ajir.entities.Personnel;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class ObjectifMangController {

	
	
	
	@Autowired
	ObjectifAgentDetPmRep objectifAgentDetPmRep;
	@Autowired
	PersonnelRep personelRep;
	@Autowired
	ObjectifAgentRep objectifAgentRep;

	@CrossOrigin
	@GetMapping("/getobjmanager/{codSoc}/{matPers}")
	 public List<ObjectifAgentDetPm> getListOjectifs(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		return this.objectifAgentDetPmRep.getListObjectif(codSoc, matPers);
		
		
	}
	
	@CrossOrigin
	@GetMapping("/getobjectifag/{codSoc}/{matPers}/{matPersAg}")
	 public List<ObjectifAgentDetPm> getListObjectifAg(@PathVariable String codSoc,@PathVariable String matPers,@PathVariable String matPersAg){
		
		
		return this.objectifAgentDetPmRep.getListObjectifAgent(codSoc, matPers,matPersAg);
		
		
	}
	
	@CrossOrigin
	@GetMapping("/getpersparservice/{codSoc}/{matPers}")
	 public List<Personnel> getListPersonnelService(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		return this.personelRep.getPersService(codSoc, matPers);
		
		
	}
	
	@PostMapping("/addobj")
	public void createClient(@RequestBody ObjectifAgent obj){
		

		String codSoc = obj.getCod_soc();
		String matPers = obj.getMat_pers();
		Integer ann =obj.getAnnee();
		Integer nObj=obj.getNum_objectif();
		String libObj=obj.getLib_objectif();
		String app=obj.getAppreciation();
		String comRcom=obj.getComment_recom();

		
		objectifAgentRep.addObj(codSoc, matPers, ann, nObj, libObj);
	}
}
