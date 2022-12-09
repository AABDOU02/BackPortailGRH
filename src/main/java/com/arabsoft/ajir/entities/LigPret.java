package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@IdClass(CleLigPret.class)
public class LigPret implements Serializable{
	
	
	@Id
	private String cod_soc;
	@Id
	private String mat_pers;
	@Id
	private Integer cod_pret;
	@Id
	private Integer l_pret;
	public String cod_typ_bul;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date mois_pret_prevu;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date mois_pret;
	public Integer mnt_period;
	public Integer mnt_int;
	public Integer int_grace;
	public Integer cap_rest;
	public String val_pret;
	public String reg_pret;
	public String nature_etat_pret;
	public Integer num_tranch;
	public String impaye;
	public Integer seq_ecrt_ppl;
	public Integer seq_ecrt_int;
	public Integer int_tmmplus;
	public Integer seq_ecrt;
	public String ordonnance;
	public Integer id_lig_pret;
	public String cod_user;
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
	public String getCod_typ_bul() {
		return cod_typ_bul;
	}
	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}
	public Date getMois_pret_prevu() {
		return mois_pret_prevu;
	}
	public void setMois_pret_prevu(Date mois_pret_prevu) {
		this.mois_pret_prevu = mois_pret_prevu;
	}
	public Date getMois_pret() {
		return mois_pret;
	}
	public void setMois_pret(Date mois_pret) {
		this.mois_pret = mois_pret;
	}
	public Integer getMnt_period() {
		return mnt_period;
	}
	public void setMnt_period(Integer mnt_period) {
		this.mnt_period = mnt_period;
	}
	public Integer getMnt_int() {
		return mnt_int;
	}
	public void setMnt_int(Integer mnt_int) {
		this.mnt_int = mnt_int;
	}
	public Integer getInt_grace() {
		return int_grace;
	}
	public void setInt_grace(Integer int_grace) {
		this.int_grace = int_grace;
	}
	public Integer getCap_rest() {
		return cap_rest;
	}
	public void setCap_rest(Integer cap_rest) {
		this.cap_rest = cap_rest;
	}
	public String getVal_pret() {
		return val_pret;
	}
	public void setVal_pret(String val_pret) {
		this.val_pret = val_pret;
	}
	public String getReg_pret() {
		return reg_pret;
	}
	public void setReg_pret(String reg_pret) {
		this.reg_pret = reg_pret;
	}
	public String getNature_etat_pret() {
		return nature_etat_pret;
	}
	public void setNature_etat_pret(String nature_etat_pret) {
		this.nature_etat_pret = nature_etat_pret;
	}
	public Integer getNum_tranch() {
		return num_tranch;
	}
	public void setNum_tranch(Integer num_tranch) {
		this.num_tranch = num_tranch;
	}
	public String getImpaye() {
		return impaye;
	}
	public void setImpaye(String impaye) {
		this.impaye = impaye;
	}
	public Integer getSeq_ecrt_ppl() {
		return seq_ecrt_ppl;
	}
	public void setSeq_ecrt_ppl(Integer seq_ecrt_ppl) {
		this.seq_ecrt_ppl = seq_ecrt_ppl;
	}
	public Integer getSeq_ecrt_int() {
		return seq_ecrt_int;
	}
	public void setSeq_ecrt_int(Integer seq_ecrt_int) {
		this.seq_ecrt_int = seq_ecrt_int;
	}
	public Integer getInt_tmmplus() {
		return int_tmmplus;
	}
	public void setInt_tmmplus(Integer int_tmmplus) {
		this.int_tmmplus = int_tmmplus;
	}
	public Integer getSeq_ecrt() {
		return seq_ecrt;
	}
	public void setSeq_ecrt(Integer seq_ecrt) {
		this.seq_ecrt = seq_ecrt;
	}
	public String getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}
	public Integer getId_lig_pret() {
		return id_lig_pret;
	}
	public void setId_lig_pret(Integer id_lig_pret) {
		this.id_lig_pret = id_lig_pret;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public LigPret(String cod_soc, String mat_pers, Integer cod_pret, Integer l_pret, String cod_typ_bul,
			Date mois_pret_prevu, Date mois_pret, Integer mnt_period, Integer mnt_int, Integer int_grace,
			Integer cap_rest, String val_pret, String reg_pret, String nature_etat_pret, Integer num_tranch,
			String impaye, Integer seq_ecrt_ppl, Integer seq_ecrt_int, Integer int_tmmplus, Integer seq_ecrt,
			String ordonnance, Integer id_lig_pret, String cod_user) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pret = cod_pret;
		this.l_pret = l_pret;
		this.cod_typ_bul = cod_typ_bul;
		this.mois_pret_prevu = mois_pret_prevu;
		this.mois_pret = mois_pret;
		this.mnt_period = mnt_period;
		this.mnt_int = mnt_int;
		this.int_grace = int_grace;
		this.cap_rest = cap_rest;
		this.val_pret = val_pret;
		this.reg_pret = reg_pret;
		this.nature_etat_pret = nature_etat_pret;
		this.num_tranch = num_tranch;
		this.impaye = impaye;
		this.seq_ecrt_ppl = seq_ecrt_ppl;
		this.seq_ecrt_int = seq_ecrt_int;
		this.int_tmmplus = int_tmmplus;
		this.seq_ecrt = seq_ecrt;
		this.ordonnance = ordonnance;
		this.id_lig_pret = id_lig_pret;
		this.cod_user = cod_user;
	}
	public LigPret() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
