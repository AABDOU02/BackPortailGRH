package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleLigPret;
import com.arabsoft.ajir.entities.LigPret;

public interface LigPretPers extends JpaRepository<LigPret, CleLigPret>{
	
	
	
	@Query(value="\r\n"
			+ "select\r\n"
			+ "cod_soc,\r\n"
			+ "mat_pers,\r\n"
			+ "cod_pret,\r\n"
			+ "l_pret,\r\n"
			+ "cod_typ_bul,\r\n"
			+ "mois_pret_prevu,\r\n"
			+ "mois_pret,\r\n"
			+ "mnt_period,\r\n"
			+ "mnt_int,\r\n"
			+ "int_grace,\r\n"
			+ "cap_rest,\r\n"
			+ "val_pret,\r\n"
			+ "reg_pret,\r\n"
			+ "nature_etat_pret,\r\n"
			+ "num_tranch,\r\n"
			+ "impaye,\r\n"
			+ "seq_ecrt_ppl,\r\n"
			+ "seq_ecrt_int,\r\n"
			+ "int_tmmplus,\r\n"
			+ "seq_ecrt,\r\n"
			+ "ordonnance,\r\n"
			+ "id_lig_pret,\r\n"
			+ "cod_user\r\n"
			+ "\r\n"
			+ "from LIG_PRET\r\n"
			+ "\r\n"
			+ "where cod_soc = :codSoc and mat_pers= :matPers and cod_pret = :codPret ",nativeQuery=true)
	public List<LigPret> getLigPretPers(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") Integer codPret );

	@Query(value="select cod_pret from LIG_PRET \r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers \r\n"
			+"GROUP BY cod_pret ",nativeQuery=true)
	public List<Integer> getPretPersCode(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

	

}
