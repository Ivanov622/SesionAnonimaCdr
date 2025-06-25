package com.codere.rest.record;

import java.time.LocalDateTime;

public record SesionRecord(String venueCode, Long slotSerialNumber, Long vendorCode, Long gameCode,
		LocalDateTime startTime, LocalDateTime endTime, Double betAmount, Double paidAmount, Double gamesPlayed,
		Double promotional) {

}
