package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arabsoft.ajir.dao.LigBultRep;
import com.arabsoft.ajir.entities.CleLigBult;
import com.arabsoft.ajir.entities.LigBult;
import com.arabsoft.ajir.exception.ProductNotFoundException;



@RequestMapping("/api/auth")
public class LigBultController {
	
	
	@Autowired
	LigBultRep ligBultRep;
	
	
	@CrossOrigin
	@GetMapping("/getligbyid/{id}")

	public ResponseEntity<LigBult> findDemandeById(@PathVariable CleLigBult id) {
		return ResponseEntity.ok(
				ligBultRep.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	
	@GetMapping("/getligB")
	public List<LigBult>  getLigB(){
			return  ligBultRep.findAll();
		}
	
}
