package com.codere.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.codere.rest.record.SesionRecord;
import com.codere.rest.utils.ParamsSesionAnonima;

public interface ISesionController {
	
	ResponseEntity<List<SesionRecord>> getSesionesByIdSala(ParamsSesionAnonima params);

}
