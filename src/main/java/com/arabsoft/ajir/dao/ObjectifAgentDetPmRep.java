package com.arabsoft.ajir.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ObjectifAgentDetPm;

public interface ObjectifAgentDetPmRep  extends JpaRepository<ObjectifAgentDetPm, String>{
	
	
	
	@Query(value="select DISTINCT  o.COD_SOC,o.mat_pers,o.annee ,o.num_objectif ,o.lib_objectif,o.appreciation,o.comment_recom, \r\n"
			+ " (SELECT u.nom_pers||' '||u.pren_pers from personnel u where u.cod_soc=o.cod_soc and \r\n"
			+ " u.mat_pers=o.mat_pers) nom_pren ,t.cod_serv \r\n"
			+ "\r\n"
			+ "from OBJECTIF_AGENT o, PERSONNEL t \r\n"
			+ "\r\n"
			+ "where  t.cod_serv = (select h.cod_serv from personnel h where h.mat_pers = :matPers and h.cod_soc = :codSoc )",nativeQuery=true)
	public List<ObjectifAgentDetPm> getListObjectif(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

	
	@Query(value="select DISTINCT  o.COD_SOC,o.mat_pers,o.annee ,o.num_objectif ,o.lib_objectif,o.appreciation,o.comment_recom, \r\n"
			+ " (SELECT u.nom_pers||' '||u.pren_pers from personnel u where u.cod_soc=o.cod_soc and \r\n"
			+ " u.mat_pers=o.mat_pers) nom_pren ,t.cod_serv \r\n"
			+ "\r\n"
			+ "from OBJECTIF_AGENT o, PERSONNEL t \r\n"
			+ "\r\n"
			+ "where  t.cod_serv = (select h.cod_serv from personnel h where h.mat_pers = :matPers and h.cod_soc = :codSoc ) and o.mat_pers = :matPersAg",nativeQuery=true)
	public List<ObjectifAgentDetPm> getListObjectifAgent(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("matPersAg") String matPersAg);

  

}
