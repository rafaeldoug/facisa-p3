package application;

import java.util.Scanner;

import entities.exceptions.FahrenheitException;
import entities.util.Utils;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Utils util = new Utils();

		System.out.print("Digite a temperatura em °F: ");
		util.setFahrenheit(sc.nextDouble());

		try {
			util.toCelsius(util.getFahrenheit());
			System.out.printf("Temperatura em °C: %.2f", util.getCelsius());
		} catch (FahrenheitException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
