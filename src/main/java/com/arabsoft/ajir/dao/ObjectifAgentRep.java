package com.arabsoft.ajir.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ObjectifAgent;

public interface ObjectifAgentRep extends JpaRepository<ObjectifAgent, String>{
	
	
	
	  @Modifying
		@Query(value="insert into OBJECTIF_AGENT (Cod_Soc,MAT_PERS,Annee,Num_Objectif,Lib_Objectif) "
				+ "values (:codSoc,:matPers,:annee,:nObjectif,:libObj)", nativeQuery = true)
	    @Transactional
		public void addObj(@Param("codSoc") String codSoc,@Param("matPers") String matPers,
				@Param("annee") Integer annee,@Param("nObjectif") Integer nObjectif,@Param("libObj") String libObj);
		
}
