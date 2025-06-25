package com.codere.rest.utils;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class ParamsSesionAnonima {
	
	private Long maquina;
	private String startTime;
	private String finalTime;
}
