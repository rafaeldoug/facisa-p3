/**
 * 
 */
package br.si.p3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import br.si.p3.ConversorTemperatura;

/**
 * @author Rafael Nascimento
 *
 */
class testConversorTemperatura {

	@Test
	void testConverteCelsiusParaFahrenheit() {

		double celsius = 0.0;

		double expResult = 32.0;

		assertEquals(expResult, ConversorTemperatura.converteCelsiusParaFahrenheit(celsius), 0.0);

	}

	@Test
	void testConverteFahrenheitParaCelsius() {

		double fahrenheit = 32.0;

		double expResult = 0.0;

		assertEquals(expResult, ConversorTemperatura.converteFahrenheitParaCelsius(fahrenheit), 0.0);

	}

	@Test
	void testConverteFahrenheitParaCelsius_02() {

		double fahrenheit = 50.0;

		double expResult = 10.0;

		assertEquals(expResult, ConversorTemperatura.converteFahrenheitParaCelsius(fahrenheit), 10.0);

	}

}
