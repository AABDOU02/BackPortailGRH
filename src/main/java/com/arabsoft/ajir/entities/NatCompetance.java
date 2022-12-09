package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NAT_COMPETENCE")
public class NatCompetance {
	
	
	
	    @Id
		public String cod_nat_comp;
		public String lib_nat_comp;
		public String lib_nat_comp_a;
		public String getCod_nat_comp() {
			return cod_nat_comp;
		}
		public void setCod_nat_comp(String cod_nat_comp) {
			this.cod_nat_comp = cod_nat_comp;
		}
		public String getLib_nat_comp() {
			return lib_nat_comp;
		}
		public void setLib_nat_comp(String lib_nat_comp) {
			this.lib_nat_comp = lib_nat_comp;
		}
		public String getLib_nat_comp_a() {
			return lib_nat_comp_a;
		}
		public void setLib_nat_comp_a(String lib_nat_comp_a) {
			this.lib_nat_comp_a = lib_nat_comp_a;
		}
		public NatCompetance(String cod_nat_comp, String lib_nat_comp, String lib_nat_comp_a) {
			super();
			this.cod_nat_comp = cod_nat_comp;
			this.lib_nat_comp = lib_nat_comp;
			this.lib_nat_comp_a = lib_nat_comp_a;
		}
		public NatCompetance() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	
}
