package com.codere.rest.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codere.rest.exception.InvalidDateFormatException;
import com.codere.rest.exception.MachineNotFoundException;
import com.codere.rest.record.SesionRecord;
import com.codere.rest.service.ISesionService;
import com.codere.rest.utils.ParamsSesionAnonima;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sesiones")
@RequiredArgsConstructor
public class SesionControllerImpl implements ISesionController {

	@Autowired
	private ISesionService sesionService;

	@GetMapping("/anonimas")
	public ResponseEntity<List<SesionRecord>> getSesionesByIdSala(@RequestBody ParamsSesionAnonima params) {

		Integer totalMaquinas = sesionService.validarMaquina(params.getMaquina());
		if (totalMaquinas != 1) {
			throw new MachineNotFoundException("La máquina ingresada no está en el inventario: " + params.getMaquina());
		}

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

		LocalDateTime startTime = null;
		LocalDateTime finalTime = null;
		try {
			startTime = LocalDateTime.parse(params.getStartTime(), dateTimeFormatter);

		} catch (DateTimeParseException e) {
			throw new InvalidDateFormatException(
					"El formato de la fecha inicial es inválido: " + params.getStartTime());
		}

		try {
			finalTime = LocalDateTime.parse(params.getFinalTime(), dateTimeFormatter);

		} catch (DateTimeParseException e) {
			throw new InvalidDateFormatException("El formato de la fecha final es inválido: " + params.getFinalTime());
		}

		return new ResponseEntity<>(sesionService.getSesionesByIdSala(params.getMaquina(), startTime, finalTime),
				HttpStatus.OK);
	}
}
