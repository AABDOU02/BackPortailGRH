package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CompetencesReq;


@Repository
public interface CompetencesReqRep  extends JpaRepository<CompetencesReq, String>{
	
	
	
	
	@Query(value="select distinct t.cod_metier,\r\n"
			+ "t.cod_post,\r\n"
			+ "cod_nat_comp, \r\n"
			+ "cod_comp,\r\n"
			+ "cod_crit_comp,\r\n"
			+ "val_crit_comp,\r\n"
			+ "coef_pond,\r\n"
			+ "typ_comp,\r\n"
			+ "cod_niv,\r\n"
			+ "id_competence_poste,\r\n"
			+ "courant,\r\n"
			+ "emploi_competence.get_coef_competence(l.cod_soc,l.mat_pers,l.poste_trav) pourcentage,\r\n"
			+ "pk_get_lib.GET_POSTE_TRAV$LIB_POST(t.cod_post) lib_post,\r\n"
			+ "pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) lib_comp,\r\n"
			+ "pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(t.cod_niv) lib_niv_comp,\r\n"
			+ "l.nom_pers||' '||l.pren_pers nom_pers,\r\n"
			+ "l.cod_soc, \r\n"
			+ "l.mat_pers, l.mat_pers,\r\n"
			+ "Pk_Get_Lib.GET_SERVICE$LIB_SERV(l.cod_soc,l.cod_serv) lib_serv\r\n"
			+ "from competence_poste t ,personnel l,poste_trav p\r\n"
			+ "where  t.cod_metier = p.cod_metier\r\n"
			+ "and t.cod_post = p.cod_post\r\n"
			+ "and l.poste_trav = p.cod_post\r\n"
			+ "and l.cod_serv= (select h.cod_serv from personnel h where  h.mat_pers= :matPers)",nativeQuery=true)
	public List<CompetencesReq> getCompetenceRequise(@Param("matPers") String matPers);

	@Query(value="select distinct t.cod_metier,\r\n"
			+ "t.cod_post,\r\n"
			+ "cod_nat_comp, \r\n"
			+ "cod_comp,\r\n"
			+ "cod_crit_comp,\r\n"
			+ "val_crit_comp,\r\n"
			+ "coef_pond,\r\n"
			+ "typ_comp,\r\n"
			+ "cod_niv,\r\n"
			+ "id_competence_poste,\r\n"
			+ "courant,\r\n"
			+ "emploi_competence.get_coef_competence(l.cod_soc,l.mat_pers,l.poste_trav) pourcentage,\r\n"
			+ "pk_get_lib.GET_POSTE_TRAV$LIB_POST(t.cod_post) lib_post,\r\n"
			+ "pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) lib_comp,\r\n"
			+ "pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(t.cod_niv) lib_niv_comp,\r\n"
			+ "l.nom_pers||' '||l.pren_pers nom_pers,\r\n"
			+ "l.cod_soc, \r\n"
			+ "l.mat_pers, l.mat_pers,\r\n"
			+ "Pk_Get_Lib.GET_SERVICE$LIB_SERV(l.cod_soc,l.cod_serv) lib_serv\r\n"
			+ "from competence_poste t ,personnel l,poste_trav p\r\n"
			+ "where  t.cod_metier = p.cod_metier\r\n"
			+ "and t.cod_post = p.cod_post\r\n"
			+ "and l.poste_trav = p.cod_post\r\n"
			+ "and l.cod_serv= (select h.cod_serv from personnel h where  h.mat_pers= :matPers)"
			+ "and l.mat_pers= :matPersAgent",nativeQuery=true)
	public List<CompetencesReq> getCompetenceRequisePers(@Param("matPers") String matPers,@Param("matPersAgent") String matPersAgent);


}
