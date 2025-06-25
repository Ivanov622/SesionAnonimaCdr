package com.codere.rest.service;

import java.time.LocalDateTime;
import java.util.List;

import com.codere.rest.record.SesionRecord;

public interface ISesionService {
	
	List<SesionRecord> getSesionesByIdSala(Long numerocontrol, LocalDateTime startTime, LocalDateTime finalTime);

	Integer validarMaquina(Long maquina);

}
