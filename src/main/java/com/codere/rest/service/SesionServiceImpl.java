package com.codere.rest.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codere.rest.record.SesionRecord;
import com.codere.rest.repository.IMaquinaRepository;
import com.codere.rest.repository.ISesionRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SesionServiceImpl implements ISesionService {
	
	@Autowired
	ISesionRepository sesionRepo;
	@Autowired
	IMaquinaRepository maquinaRepo;
	
	public Integer validarMaquina(Long maquina) {
		return maquinaRepo.validarMaquina(maquina);		
	}
	
	public List<SesionRecord> getSesionesByIdSala(Long maquina, LocalDateTime startTime, LocalDateTime finalTime){
		return sesionRepo.getSesionesByIdSala(maquina, startTime, finalTime);		
	}

}
