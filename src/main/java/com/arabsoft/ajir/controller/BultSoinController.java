package com.arabsoft.ajir.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.ActeRep;
import com.arabsoft.ajir.dao.BultSoinRep;
import com.arabsoft.ajir.dao.LigBultRep;

import com.arabsoft.ajir.entities.BultSoin;
import com.arabsoft.ajir.entities.LigBult;


@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api")
public class BultSoinController {


	
	@Autowired
	BultSoinRep bultSoinRep;
	@Autowired
	LigBultRep ligBultRep;
	
	@Autowired
	ActeRep actRep;
	
	@PostMapping("/bsoindet")
	public BultSoin getBsoinDet(@RequestBody BultSoin b){
		
		
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		Integer numSoins = b.getNum_soins();
		
		List<BultSoin> bs = this.bultSoinRep.getBultSoins(codSoc, matPers, numSoins);
		
		
	    for (int i = 0; i <bs.size(); i++) {
	    	if(i==bs.size()-1) {
	        System.out.println(bs.get(i));
	    	bs.get(i).setLigBult(ligBultRep.getLigBult(codSoc, matPers, numSoins));
			bs.get(i).setNumSoinParam(ligBultRep.getNumSoinParam(codSoc, matPers));
			 
	    }
	    }
	    
	    
	    if (!bs.isEmpty()) {
		return  bs.get(bs.size()-1);
	    }
	    else
	    {
	    	return null;
	    }
	    
		
	}
	
	
	@CrossOrigin
	@GetMapping("/getbultsoinscode/{codSoc}/{matPers}")
	 public List<String> getListCodSoin(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		
		return ligBultRep.getNumSoinParam(codSoc, matPers);
		
		
	}
}
