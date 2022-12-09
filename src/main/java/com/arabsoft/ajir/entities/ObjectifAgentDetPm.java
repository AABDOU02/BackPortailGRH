package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class ObjectifAgentDetPm {
	
	
	
	public String cod_soc;
	public String mat_pers;
	public Integer annee;
	@Id
	public Integer num_objectif;
	public String lib_objectif;
	public String appreciation;
	public String comment_recom;

	public String nom_pren;
	public String cod_serv;
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
	public Integer getAnnee() {
		return annee;
	}
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}
	public Integer getNum_objectif() {
		return num_objectif;
	}
	public void setNum_objectif(Integer num_objectif) {
		this.num_objectif = num_objectif;
	}
	public String getLib_objectif() {
		return lib_objectif;
	}
	public void setLib_objectif(String lib_objectif) {
		this.lib_objectif = lib_objectif;
	}
	public String getAppreciation() {
		return appreciation;
	}
	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
	public String getComment_recom() {
		return comment_recom;
	}
	public void setComment_recom(String comment_recom) {
		this.comment_recom = comment_recom;
	}
	public String getNom_pren() {
		return nom_pren;
	}
	public void setNom_pren(String nom_pren) {
		this.nom_pren = nom_pren;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public ObjectifAgentDetPm(String cod_soc, String mat_pers, Integer annee, Integer num_objectif, String lib_objectif,
			String appreciation, String comment_recom, String nom_pren, String cod_serv) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.annee = annee;
		this.num_objectif = num_objectif;
		this.lib_objectif = lib_objectif;
		this.appreciation = appreciation;
		this.comment_recom = comment_recom;
		this.nom_pren = nom_pren;
		this.cod_serv = cod_serv;
	}
	public ObjectifAgentDetPm() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	

}
