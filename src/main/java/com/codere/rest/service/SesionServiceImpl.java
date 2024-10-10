package com.codere.rest.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codere.rest.record.SesionRecord;
import com.codere.rest.repository.ISesionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SesionServiceImpl implements ISesionService {
	
	@Autowired
	ISesionRepository repo;
	
	public List<SesionRecord> getSesionesByIdSala(Long numerocontrol, LocalDateTime fechaIn, LocalDateTime fechaFinal){

		return repo.getSesionesByIdSala(numerocontrol, fechaIn, fechaFinal);
		
	}

}
