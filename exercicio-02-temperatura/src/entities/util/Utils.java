package entities.util;

import entities.exceptions.FahrenheitException;

public class Utils {

	private static final double ZERO_ABSOLUTO = -459.67;

	private Double fahrenheit;
	private Double celsius;

	public double toCelsius(double fahrenheit) throws FahrenheitException {
	
		if (celsius < ZERO_ABSOLUTO) {
			throw new FahrenheitException("Erro: Abaixo de Zero Absoluto!");
		}
		return (5 * (fahrenheit - 32)) / 9;
	}

	/**
	 * @return the fahrenheit
	 */
	public Double getFahrenheit() {
		return fahrenheit;
	}

	/**
	 * @param fahrenheit the fahrenheit to set
	 */
	public void setFahrenheit(Double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	/**
	 * @return the celsius
	 */
	public Double getCelsius() {
		return celsius;
	}

	/**
	 * @param celsius the celsius to set
	 */
	public void setCelsius(Double celsius) {
		this.celsius = celsius;
	}

}
