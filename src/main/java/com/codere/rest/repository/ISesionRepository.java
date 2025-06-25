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
			s.startTime, s.endTime, s.deltaEntradas*s.valorCredito, (s.deltaSalidas+s.deltaJackpot)*s.valorCredito, s.gamesPlayed, s.promotional)
			from Sesion s where s.slotSerialNumber =:numerocontrol and s.estado > 0 and s.startTime >=:startTime and s.endTime <=:finalTime	
			""")
		List<SesionRecord> getSesionesByIdSala(@Param("numerocontrol")Long numerocontrol, @Param("startTime")LocalDateTime startTime, @Param("finalTime")LocalDateTime finalTime);
}
