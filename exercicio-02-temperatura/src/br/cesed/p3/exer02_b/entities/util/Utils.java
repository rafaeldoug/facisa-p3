package br.cesed.p3.exer02_b.entities.util;

import br.cesed.p3.exer02_b.entities.exceptions.FahrenheitException;

public class Utils {

	private static final double ZERO_ABSOLUTO = -459.67;

	public static double toCelsius(double valor) throws FahrenheitException {
	
		if (valor < ZERO_ABSOLUTO) {
			throw new FahrenheitException("Erro: Abaixo de Zero Absoluto!");
		}
		return (5 * (valor - 32)) / 9;
	}

}
