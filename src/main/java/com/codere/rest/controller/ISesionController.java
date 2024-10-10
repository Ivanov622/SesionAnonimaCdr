package com.codere.rest.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.codere.rest.record.SesionRecord;

public interface ISesionController {
	
	ResponseEntity<List<SesionRecord>> getSesionesByIdSala(Long numerocontrol, LocalDateTime fechaIn, LocalDateTime fechaFinal);
}
