package com.codere.rest.repository;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.codere.rest.model.Sesion;
import com.codere.rest.record.SesionRecord;

@Repository
public interface ISesionRepository extends JpaRepository<Sesion, Long> {
	
	@Query("""			
			select new com.codere.rest.record.SesionRecord(s.venueCode, s.slotSerialNumber, s.vendorCode, s.gameCode, 
			s.startTime, s.endTime, s.betAmount, s.paidAmount, s.gamesPlayed)
			from Sesion s where s.slotSerialNumber =:numerocontrol and s.estado = 1 and s.startTime <=:fechaIn and s.endTime >=:fechaFinal	
			""")
	List<SesionRecord> getSesionesByIdSala(@Param("numerocontrol")Long numerocontrol, @Param("fechaIn")LocalDateTime fechaIn, @Param("fechaFinal")LocalDateTime fechaFinal);
	
}
