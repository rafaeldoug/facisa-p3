package application;

import java.util.Scanner;

import entities.exceptions.FahrenheitException;
import entities.util.Utils;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em °F: ");
		double valor = sc.nextDouble();
		
		double celsius;

		try {
			celsius = Utils.toCelsius(valor);
			System.out.printf("Temperatura em °C: %.1f" , celsius);
		} catch (FahrenheitException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\nPrograma finalizado!");
		}

		sc.close();

	}

}
