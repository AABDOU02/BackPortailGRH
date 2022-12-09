package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OBJECTIF_AGENT")
public class ObjectifAgent {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "COD_SOC")
	public String cod_soc;
	@Column(name = "MAT_PERS")
	public String mat_pers;
	@Column(name = "ANNEE")
	public Integer annee;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NUM_OBJECTIF")
	private Integer num_objectif;
	@Column(name = "LIB_OBJECTIF")
	public String lib_objectif;
	@Column(name = "APPRECIATION")
	public String appreciation;
	@Column(name = "COMMENT_RECOM")
	public String comment_recom;
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
	public ObjectifAgent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
