/**
 * 
 */
package br.si.p3;

/**
 * @author Rafael Nascimento
 *
 */
public class TemperaturaCelsius {

	private double celsius;

	public TemperaturaCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double converteCelsiusParaFahrenheit() {
		double fahrenheit = 1.8 * celsius + 32; // f =1,8*c+32
		return fahrenheit;
	}

}
