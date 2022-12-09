package com.arabsoft.ajir.entities;

import java.io.Serializable;

import javax.persistence.Id;

public class CleLigPret implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cod_soc;

	private String mat_pers;
	
	private Integer cod_pret;

	private Integer l_pret;

	public String getCod_soc() {
		return cod_soc;
	}

	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}

	public String getMat_pers() {
		return mat_pers;
	}

	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}

	public Integer getCod_pret() {
		return cod_pret;
	}

	public void setCod_pret(Integer cod_pret) {
		this.cod_pret = cod_pret;
	}

	public Integer getL_pret() {
		return l_pret;
	}

	public void setL_pret(Integer l_pret) {
		this.l_pret = l_pret;
	}

	public CleLigPret(String cod_soc, String mat_pers, Integer cod_pret, Integer l_pret) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pret = cod_pret;
		this.l_pret = l_pret;
	}

	public CleLigPret() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
