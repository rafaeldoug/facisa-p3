/**
 * 
 */
package br.si.p3.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.si.p3.TemperaturaCelsius;

/**
 * @author Rafael Nascimento
 *
 */
class testTemperaturaCelsius {

	@Test
	void testconverteCelsiusParaFahrenheit() {

		TemperaturaCelsius instance = new TemperaturaCelsius(0);

		double expResult = 32.0;

		assertEquals(expResult, instance.converteCelsiusParaFahrenheit());

	}

}
