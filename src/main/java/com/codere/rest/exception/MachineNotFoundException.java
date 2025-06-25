package com.codere.rest.exception;

public class MachineNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MachineNotFoundException(String message) {
        super(message);
    }

}
