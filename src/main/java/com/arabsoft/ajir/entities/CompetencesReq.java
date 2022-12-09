package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
public class CompetencesReq {

	
	
	    
		public String cod_metier;
		
		public String cod_post;
		public String cod_nat_comp;
		@Id
		public String cod_comp;
		public String cod_crit_comp;
		public String val_crit_comp;
		public Integer coef_pond;
		public String typ_comp;
		public String cod_niv;
		public Integer id_competence_poste;
		public String courant;
		
		
	    public Integer pourcentage;
	    public String lib_post; 
	    public String lib_comp; 
	    public String lib_niv_comp;
	    public String nom_pers;
	    public String cod_soc;
	    public String mat_pers;
	    public String lib_serv;

	    
	    
	    
		public String getMat_pers() {
			return mat_pers;
		}
		public void setMat_pers(String mat_pers) {
			this.mat_pers = mat_pers;
		}
		public String getCod_soc() {
			return cod_soc;
		}
		public void setCod_soc(String cod_soc) {
			this.cod_soc = cod_soc;
		}
		public String getNom_pers() {
			return nom_pers;
		}
		public void setNom_pers(String nom_pers) {
			this.nom_pers = nom_pers;
		}
		public String getCod_metier() {
			return cod_metier;
		}
		public void setCod_metier(String cod_metier) {
			this.cod_metier = cod_metier;
		}
		public String getCod_post() {
			return cod_post;
		}
		public void setCod_post(String cod_post) {
			this.cod_post = cod_post;
		}
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
		public String getCod_crit_comp() {
			return cod_crit_comp;
		}
		public void setCod_crit_comp(String cod_crit_comp) {
			this.cod_crit_comp = cod_crit_comp;
		}
		public String getVal_crit_comp() {
			return val_crit_comp;
		}
		public void setVal_crit_comp(String val_crit_comp) {
			this.val_crit_comp = val_crit_comp;
		}
		public Integer getCoef_pond() {
			return coef_pond;
		}
		public void setCoef_pond(Integer coef_pond) {
			this.coef_pond = coef_pond;
		}
		public String getTyp_comp() {
			return typ_comp;
		}
		public void setTyp_comp(String typ_comp) {
			this.typ_comp = typ_comp;
		}
		public String getCod_niv() {
			return cod_niv;
		}
		public void setCod_niv(String cod_niv) {
			this.cod_niv = cod_niv;
		}
		public Integer getId_competence_poste() {
			return id_competence_poste;
		}
		public void setId_competence_poste(Integer id_competence_poste) {
			this.id_competence_poste = id_competence_poste;
		}
		public String getCourant() {
			return courant;
		}
		public void setCourant(String courant) {
			this.courant = courant;
		}
		public Integer getPourcentage() {
			return pourcentage;
		}
		public void setPourcentage(Integer pourcentage) {
			this.pourcentage = pourcentage;
		}
		public String getLib_post() {
			return lib_post;
		}
		public void setLib_post(String lib_post) {
			this.lib_post = lib_post;
		}
		public String getLib_comp() {
			return lib_comp;
		}
		public void setLib_comp(String lib_comp) {
			this.lib_comp = lib_comp;
		}
		public String getLib_niv_comp() {
			return lib_niv_comp;
		}
		public void setLib_niv_comp(String lib_niv_comp) {
			this.lib_niv_comp = lib_niv_comp;
		}
		public CompetencesReq() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CompetencesReq(String cod_metier, String cod_post, String cod_nat_comp, String cod_comp,
				String cod_crit_comp, String val_crit_comp, Integer coef_pond, String typ_comp, String cod_niv,
				Integer id_competence_poste, String courant, Integer pourcentage, String lib_post, String lib_comp,
				String lib_niv_comp, String nom_pers, String cod_soc, String mat_pers) {
			super();
			this.cod_metier = cod_metier;
			this.cod_post = cod_post;
			this.cod_nat_comp = cod_nat_comp;
			this.cod_comp = cod_comp;
			this.cod_crit_comp = cod_crit_comp;
			this.val_crit_comp = val_crit_comp;
			this.coef_pond = coef_pond;
			this.typ_comp = typ_comp;
			this.cod_niv = cod_niv;
			this.id_competence_poste = id_competence_poste;
			this.courant = courant;
			this.pourcentage = pourcentage;
			this.lib_post = lib_post;
			this.lib_comp = lib_comp;
			this.lib_niv_comp = lib_niv_comp;
			this.nom_pers = nom_pers;
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
		}
		
	
	
}
