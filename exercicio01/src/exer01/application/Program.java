package exer01.application;

import java.util.Locale;
import java.util.Scanner;

import exer01.entidades.Conta;
import exer01.entidades.ContaCorrente;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Conta cc = new ContaCorrente(1001, 11100, "Doug", 0.0);
		System.out.println(cc);
		cc.depositar(100.00);
		cc.setValorLimite(200.0);
		System.out.println(cc);
		
				
		
		

	}

}
