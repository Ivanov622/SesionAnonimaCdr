package com.codere.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.codere.rest.model.MaquinaGeneral;

@Repository
public interface IMaquinaRepository extends JpaRepository<MaquinaGeneral, Long> {
	
	@Query("""			
			select count(m.numerocontrol)
			from MaquinaGeneral m where m.numerocontrol =:numerocontrol	
			""")
		Integer validarMaquina(@Param("numerocontrol") Long numerocontrol);

}
