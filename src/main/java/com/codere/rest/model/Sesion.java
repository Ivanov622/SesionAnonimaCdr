package com.codere.rest.model;

import java.time.LocalDateTime;

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
@Table(name = "pt_sesionesanonimas")
public class Sesion {
	
	@Id
	@Column(name = "id")
	private Long id;	
	
	@Column(name = "codigosala")
	private String venueCode;
	
	@Column(name = "numerocontrol")
	private Long slotSerialNumber;
	
	@Column(name = "valorcredito")
	private Double valorCredito;
	
	@Column(name = "fabricante")
	private Long vendorCode;
	
	@Column(name = "juego")
	private Long gameCode;
	
	@Column(name = "entradas")
	private Double entradas;
	
	@Column(name = "salidas")
	private Double salidas;
	
	@Column(name = "cajon")
	private Double cajon;
	
	@Column(name = "jackpot")
	private Double jackpot;
	
	@Column(name = "jugadas")
	private Long jugadas;
	
	@Column(name = "fechain")
	private LocalDateTime startTime;
	
	@Column(name = "lastentradas")
	private Double lastentradas;
	
	@Column(name = "lastsalidas")
	private Double lastsalidas;
	
	@Column(name = "lastcajon")
	private Double lastCajon;
	
	@Column(name = "lastjackpot")
	private Double lastJackpot;
	
	@Column(name = "lastjugadas")
	private Double lastJugadas;
	
	@Column(name = "fechaout")
	private LocalDateTime endTime;
	
	@Column(name = "estado")
	private Integer estado;
	
	@Column(name = "deltaentradas")
	private Double deltaEntradas;
	
	@Column(name = "deltasalidas")
	private Double deltaSalidas;
	
	@Column(name = "deltacajon")
	private Double deltaCajon;
	
	@Column(name = "deltajackpot")
	private Double deltaJackpot;
	
	@Column(name = "deltajugadas")
	private Double gamesPlayed;
	
	@Column(name = "promocional")
	private Double promotional;
	
	 

}
