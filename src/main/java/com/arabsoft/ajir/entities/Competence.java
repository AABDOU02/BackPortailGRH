package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Competence {
	
	@Id
	public String cod_nat_comp;
	public String cod_comp;
	public String lib_comp;
	public String lib_comp_a;
	public Integer id_competence;
	public String getCod_nat_comp() {
		return cod_nat_comp;
	}
	public void setCod_nat_comp(String cod_nat_comp) {
		this.cod_nat_comp = cod_nat_comp;
	}
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}
	public String getLib_comp() {
		return lib_comp;
	}
	public void setLib_comp(String lib_comp) {
		this.lib_comp = lib_comp;
	}
	public String getLib_comp_a() {
		return lib_comp_a;
	}
	public void setLib_comp_a(String lib_comp_a) {
		this.lib_comp_a = lib_comp_a;
	}
	public Integer getId_competence() {
		return id_competence;
	}
	public void setId_competence(Integer id_competence) {
		this.id_competence = id_competence;
	}
	public Competence(String cod_nat_comp, String cod_comp, String lib_comp, String lib_comp_a, Integer id_competence) {
		super();
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
		this.lib_comp = lib_comp;
		this.lib_comp_a = lib_comp_a;
		this.id_competence = id_competence;
	}
	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
