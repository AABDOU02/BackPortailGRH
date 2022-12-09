package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CompetenceDet;


@Repository
public interface CompetenceDetRep extends JpaRepository<CompetenceDet, String>{
	
	
	
	@Query(value="select t.cod_soc,\r\n"
			+ "cod_candidat,\r\n"
			+ "typ_candidat,\r\n"
			+ "cod_nat_comp,\r\n"
			+ "cod_comp,\r\n"
			+ "cod_crit_comp,\r\n"
			+ "val_crit_comp,\r\n"
			+ "dat_valid,\r\n"
			+ "appreciation,\r\n"
			+ "cod_niv_comp,\r\n"
			+ "denom,\r\n"
			+ "div,\r\n"
			+ "id_competence_pers,\r\n"
			+ "l.cod_serv,\r\n"
			+ "\r\n"
			+ "pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(t.cod_niv_comp)  lib_niv_comp,\r\n"
			+ "pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) lib_comp,\r\n"
			+ "l.nom_pers||' '||l.pren_pers nom_pers,\r\n"
			+ "from COMPETENCE_PERS t ,personnel l\r\n"
			+ "where t.cod_soc = l.cod_soc\r\n"
			+ "and t.cod_candidat = l.mat_pers\r\n"
			+ "and l.cod_serv= (select h.cod_serv from personnel h where  h.mat_pers= :matPers)",nativeQuery=true)
	public List<CompetenceDet> getCompetenceServ(@Param("matPers") String matPers);
	


}
