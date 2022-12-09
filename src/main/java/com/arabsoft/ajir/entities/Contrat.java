package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@IdClass(CleContrat.class)
public class Contrat {
	
	@Id
	private String cod_soc;
    @Id
	private String mat_pers;
    @Id
	private Integer num_contrat;
	public String cod_typ;
	public String etat;
	public String nat_contrat;
	public Integer num_num_contrat;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_contrat;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_ech;
	public String cod_motif;
	public String cod_dept;
	public String cod_serv;
	public Integer mnt_mens;
	public String cod_eva;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date date_eva;
	public String cod_niveau;
	public String valid;
	public Integer duree;
	public String cod_fill;
	public Integer num_ord;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_eff_contrat;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_ord;
	public String edit;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_creation;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_valid;
	public String nouv_motif;
	public Integer duree_essai;
	public String cod_affect;
	public Integer num_mvt;
	public String cod_alert;
	public Integer seq_alert;
	public String nadm_tech;
	public String ncod_affect;
	public String ncod_serv;
	public Integer nbr_pts;
	public String cod_cat;
	public String cod_grad;
	public String cod_categ;
	public Integer cod_ech;
	public Integer niv_sal;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_rupture;
	public String typ_salaire;
	public String ncod_categ;
	public String ncod_cat;
	public String ncod_grad;
	public Integer ncod_ech;
	public String ncod_stat;
	public Integer id_contrat;
	public String cod_user;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_fin_essai;
	@JsonFormat(pattern = "yyyy-MM-dd")
    public Date dat_ech_fin;
	
	public String nom_pren;
	public String lib_contrat;
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
		public Integer getNum_contrat() {
			return num_contrat;
		}
		public void setNum_contrat(Integer num_contrat) {
			this.num_contrat = num_contrat;
		}
		public String getCod_typ() {
			return cod_typ;
		}
		public void setCod_typ(String cod_typ) {
			this.cod_typ = cod_typ;
		}
		public String getEtat() {
			return etat;
		}
		public void setEtat(String etat) {
			this.etat = etat;
		}
		public String getNat_contrat() {
			return nat_contrat;
		}
		public void setNat_contrat(String nat_contrat) {
			this.nat_contrat = nat_contrat;
		}
		public Integer getNum_num_contrat() {
			return num_num_contrat;
		}
		public void setNum_num_contrat(Integer num_num_contrat) {
			this.num_num_contrat = num_num_contrat;
		}
		public Date getDat_contrat() {
			return dat_contrat;
		}
		public void setDat_contrat(Date dat_contrat) {
			this.dat_contrat = dat_contrat;
		}
		public Date getDat_ech() {
			return dat_ech;
		}
		public void setDat_ech(Date dat_ech) {
			this.dat_ech = dat_ech;
		}
		public String getCod_motif() {
			return cod_motif;
		}
		public void setCod_motif(String cod_motif) {
			this.cod_motif = cod_motif;
		}
		public String getCod_dept() {
			return cod_dept;
		}
		public void setCod_dept(String cod_dept) {
			this.cod_dept = cod_dept;
		}
		public String getCod_serv() {
			return cod_serv;
		}
		public void setCod_serv(String cod_serv) {
			this.cod_serv = cod_serv;
		}
		public Integer getMnt_mens() {
			return mnt_mens;
		}
		public void setMnt_mens(Integer mnt_mens) {
			this.mnt_mens = mnt_mens;
		}
		public String getCod_eva() {
			return cod_eva;
		}
		public void setCod_eva(String cod_eva) {
			this.cod_eva = cod_eva;
		}
		public Date getDate_eva() {
			return date_eva;
		}
		public void setDate_eva(Date date_eva) {
			this.date_eva = date_eva;
		}
		public String getCod_niveau() {
			return cod_niveau;
		}
		public void setCod_niveau(String cod_niveau) {
			this.cod_niveau = cod_niveau;
		}
		public String getValid() {
			return valid;
		}
		public void setValid(String valid) {
			this.valid = valid;
		}
		public Integer getDuree() {
			return duree;
		}
		public void setDuree(Integer duree) {
			this.duree = duree;
		}
		public String getCod_fill() {
			return cod_fill;
		}
		public void setCod_fill(String cod_fill) {
			this.cod_fill = cod_fill;
		}
		public Integer getNum_ord() {
			return num_ord;
		}
		public void setNum_ord(Integer num_ord) {
			this.num_ord = num_ord;
		}
		public Date getDat_eff_contrat() {
			return dat_eff_contrat;
		}
		public void setDat_eff_contrat(Date dat_eff_contrat) {
			this.dat_eff_contrat = dat_eff_contrat;
		}
		public Date getDat_ord() {
			return dat_ord;
		}
		public void setDat_ord(Date dat_ord) {
			this.dat_ord = dat_ord;
		}
		public String getEdit() {
			return edit;
		}
		public void setEdit(String edit) {
			this.edit = edit;
		}
		public Date getDat_creation() {
			return dat_creation;
		}
		public void setDat_creation(Date dat_creation) {
			this.dat_creation = dat_creation;
		}
		public Date getDat_valid() {
			return dat_valid;
		}
		public void setDat_valid(Date dat_valid) {
			this.dat_valid = dat_valid;
		}
		public String getNouv_motif() {
			return nouv_motif;
		}
		public void setNouv_motif(String nouv_motif) {
			this.nouv_motif = nouv_motif;
		}
		public Integer getDuree_essai() {
			return duree_essai;
		}
		public void setDuree_essai(Integer duree_essai) {
			this.duree_essai = duree_essai;
		}
		public String getCod_affect() {
			return cod_affect;
		}
		public void setCod_affect(String cod_affect) {
			this.cod_affect = cod_affect;
		}
		public Integer getNum_mvt() {
			return num_mvt;
		}
		public void setNum_mvt(Integer num_mvt) {
			this.num_mvt = num_mvt;
		}
		public String getCod_alert() {
			return cod_alert;
		}
		public void setCod_alert(String cod_alert) {
			this.cod_alert = cod_alert;
		}
		public Integer getSeq_alert() {
			return seq_alert;
		}
		public void setSeq_alert(Integer seq_alert) {
			this.seq_alert = seq_alert;
		}
		public String getNadm_tech() {
			return nadm_tech;
		}
		public void setNadm_tech(String nadm_tech) {
			this.nadm_tech = nadm_tech;
		}
		public String getNcod_affect() {
			return ncod_affect;
		}
		public void setNcod_affect(String ncod_affect) {
			this.ncod_affect = ncod_affect;
		}
		public String getNcod_serv() {
			return ncod_serv;
		}
		public void setNcod_serv(String ncod_serv) {
			this.ncod_serv = ncod_serv;
		}
		public Integer getNbr_pts() {
			return nbr_pts;
		}
		public void setNbr_pts(Integer nbr_pts) {
			this.nbr_pts = nbr_pts;
		}
		public String getCod_cat() {
			return cod_cat;
		}
		public void setCod_cat(String cod_cat) {
			this.cod_cat = cod_cat;
		}
		public String getCod_grad() {
			return cod_grad;
		}
		public void setCod_grad(String cod_grad) {
			this.cod_grad = cod_grad;
		}
		public String getCod_categ() {
			return cod_categ;
		}
		public void setCod_categ(String cod_categ) {
			this.cod_categ = cod_categ;
		}
		public Integer getCod_ech() {
			return cod_ech;
		}
		public void setCod_ech(Integer cod_ech) {
			this.cod_ech = cod_ech;
		}
		public Integer getNiv_sal() {
			return niv_sal;
		}
		public void setNiv_sal(Integer niv_sal) {
			this.niv_sal = niv_sal;
		}
		public Date getDat_rupture() {
			return dat_rupture;
		}
		public void setDat_rupture(Date dat_rupture) {
			this.dat_rupture = dat_rupture;
		}
		public String getTyp_salaire() {
			return typ_salaire;
		}
		public void setTyp_salaire(String typ_salaire) {
			this.typ_salaire = typ_salaire;
		}
		public String getNcod_categ() {
			return ncod_categ;
		}
		public void setNcod_categ(String ncod_categ) {
			this.ncod_categ = ncod_categ;
		}
		public String getNcod_cat() {
			return ncod_cat;
		}
		public void setNcod_cat(String ncod_cat) {
			this.ncod_cat = ncod_cat;
		}
		public String getNcod_grad() {
			return ncod_grad;
		}
		public void setNcod_grad(String ncod_grad) {
			this.ncod_grad = ncod_grad;
		}
		public Integer getNcod_ech() {
			return ncod_ech;
		}
		public void setNcod_ech(Integer ncod_ech) {
			this.ncod_ech = ncod_ech;
		}
		public String getNcod_stat() {
			return ncod_stat;
		}
		public void setNcod_stat(String ncod_stat) {
			this.ncod_stat = ncod_stat;
		}
		public Integer getId_contrat() {
			return id_contrat;
		}
		public void setId_contrat(Integer id_contrat) {
			this.id_contrat = id_contrat;
		}
		public String getCod_user() {
			return cod_user;
		}
		public void setCod_user(String cod_user) {
			this.cod_user = cod_user;
		}
		public Date getDat_fin_essai() {
			return dat_fin_essai;
		}
		public void setDat_fin_essai(Date dat_fin_essai) {
			this.dat_fin_essai = dat_fin_essai;
		}
		public Date getDat_ech_fin() {
			return dat_ech_fin;
		}
		public void setDat_ech_fin(Date dat_ech_fin) {
			this.dat_ech_fin = dat_ech_fin;
		}
		public String getNom_pren() {
			return nom_pren;
		}
		public void setNom_pren(String nom_pren) {
			this.nom_pren = nom_pren;
		}
		public String getLib_contrat() {
			return lib_contrat;
		}
		public void setLib_contrat(String lib_contrat) {
			this.lib_contrat = lib_contrat;
		}
		public Contrat() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Contrat(String cod_soc, String mat_pers, Integer num_contrat, String cod_typ, String etat,
				String nat_contrat, Integer num_num_contrat, Date dat_contrat, Date dat_ech, String cod_motif,
				String cod_dept, String cod_serv, Integer mnt_mens, String cod_eva, Date date_eva, String cod_niveau,
				String valid, Integer duree, String cod_fill, Integer num_ord, Date dat_eff_contrat, Date dat_ord,
				String edit, Date dat_creation, Date dat_valid, String nouv_motif, Integer duree_essai,
				String cod_affect, Integer num_mvt, String cod_alert, Integer seq_alert, String nadm_tech,
				String ncod_affect, String ncod_serv, Integer nbr_pts, String cod_cat, String cod_grad,
				String cod_categ, Integer cod_ech, Integer niv_sal, Date dat_rupture, String typ_salaire,
				String ncod_categ, String ncod_cat, String ncod_grad, Integer ncod_ech, String ncod_stat,
				Integer id_contrat, String cod_user, Date dat_fin_essai, Date dat_ech_fin, String nom_pren,
				String lib_contrat) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.num_contrat = num_contrat;
			this.cod_typ = cod_typ;
			this.etat = etat;
			this.nat_contrat = nat_contrat;
			this.num_num_contrat = num_num_contrat;
			this.dat_contrat = dat_contrat;
			this.dat_ech = dat_ech;
			this.cod_motif = cod_motif;
			this.cod_dept = cod_dept;
			this.cod_serv = cod_serv;
			this.mnt_mens = mnt_mens;
			this.cod_eva = cod_eva;
			this.date_eva = date_eva;
			this.cod_niveau = cod_niveau;
			this.valid = valid;
			this.duree = duree;
			this.cod_fill = cod_fill;
			this.num_ord = num_ord;
			this.dat_eff_contrat = dat_eff_contrat;
			this.dat_ord = dat_ord;
			this.edit = edit;
			this.dat_creation = dat_creation;
			this.dat_valid = dat_valid;
			this.nouv_motif = nouv_motif;
			this.duree_essai = duree_essai;
			this.cod_affect = cod_affect;
			this.num_mvt = num_mvt;
			this.cod_alert = cod_alert;
			this.seq_alert = seq_alert;
			this.nadm_tech = nadm_tech;
			this.ncod_affect = ncod_affect;
			this.ncod_serv = ncod_serv;
			this.nbr_pts = nbr_pts;
			this.cod_cat = cod_cat;
			this.cod_grad = cod_grad;
			this.cod_categ = cod_categ;
			this.cod_ech = cod_ech;
			this.niv_sal = niv_sal;
			this.dat_rupture = dat_rupture;
			this.typ_salaire = typ_salaire;
			this.ncod_categ = ncod_categ;
			this.ncod_cat = ncod_cat;
			this.ncod_grad = ncod_grad;
			this.ncod_ech = ncod_ech;
			this.ncod_stat = ncod_stat;
			this.id_contrat = id_contrat;
			this.cod_user = cod_user;
			this.dat_fin_essai = dat_fin_essai;
			this.dat_ech_fin = dat_ech_fin;
			this.nom_pren = nom_pren;
			this.lib_contrat = lib_contrat;
		}
	   
	    
		
		
	}