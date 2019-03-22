package br.com.itau.taa.exceptions;

public class SaldoInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public SaldoInsuficienteException(String message) {
		super(message);
	}

}
