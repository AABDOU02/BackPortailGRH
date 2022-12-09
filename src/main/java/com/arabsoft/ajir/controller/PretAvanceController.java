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

import com.arabsoft.ajir.dao.LigPretPers;
import com.arabsoft.ajir.dao.PretPersDetRep;
import com.arabsoft.ajir.entities.PretPersDet;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class PretAvanceController {

	
	@Autowired
	PretPersDetRep pretPersDetRep;

	@Autowired
	LigPretPers ligPretPersRep;

	@PostMapping("/getpretlig")
	public PretPersDet getPret(@RequestBody PretPersDet b)  {
		 
		
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		Integer codPret = b.getCod_pret();
		
		
		PretPersDet pr= this.pretPersDetRep.getPret(codSoc, matPers,codPret);
		pr.setListCodPret(this.pretPersDetRep.getListCodPret(codSoc, matPers));
		pr.setLigPretPers(ligPretPersRep.getLigPretPers(codSoc, matPers, codPret));
		
		
		
		return pr;
		
				
		
	}
	

	@CrossOrigin
	@GetMapping("/getpretperscode/{codSoc}/{matPers}")
	 public List<Integer> getListCodPretPers(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		
		return ligPretPersRep.getPretPersCode(codSoc, matPers);
		
		
	}

}
