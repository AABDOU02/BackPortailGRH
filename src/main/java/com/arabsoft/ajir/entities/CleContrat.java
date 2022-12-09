package com.arabsoft.ajir.entities;

import java.io.Serializable;


public class CleContrat  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String cod_soc;
	private String mat_pers;
	private Integer num_contrat;
	private String getCod_soc() {
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
	public Integer getNum_contrat() {
		return num_contrat;
	}
	public void setNum_contrat(Integer num_contrat) {
		this.num_contrat = num_contrat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CleContrat(String cod_soc, String mat_pers, Integer num_contrat) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_contrat = num_contrat;
	}
	public CleContrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
