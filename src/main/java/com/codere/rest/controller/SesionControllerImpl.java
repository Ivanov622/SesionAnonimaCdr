package com.codere.rest.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codere.rest.record.SesionRecord;
import com.codere.rest.service.ISesionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sesiones")
@RequiredArgsConstructor
public class SesionControllerImpl implements ISesionController {
	
	@Autowired
    private ISesionService sesionService;
	
    @GetMapping("/anonimas")
    public ResponseEntity<List<SesionRecord>> getSesionesByIdSala(Long numerocontrol, LocalDateTime fechaIn, LocalDateTime fechaFinal) {
    	return new ResponseEntity<>(sesionService.getSesionesByIdSala(numerocontrol, fechaIn, fechaFinal), HttpStatus.OK);

      //  return  sesionService.getSesionesByIdSala(numerocontrol, fechaIn, fechaFinal);
    }

}
