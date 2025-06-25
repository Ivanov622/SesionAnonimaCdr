package com.codere.rest.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "in_mpms_generales")
public class MaquinaGeneral {
	
	@Id
	@Column(name = "numerocontrol")
	private Long numerocontrol;
	private Long software;
	private Long presupuesto;
	private Long modelo;
	private String propietario;
	private Integer fabricante;
	private Integer tipoVisualizacion;
	private Long codigoEstado;
	private Date fechaEstado;
	private String serie;
	private Long marcabilletero; 
	private Long numeroControlViejo;
	private Long codigoParticipacion;
	private Integer idPropietario;

}
