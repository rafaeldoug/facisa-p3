package exer01.application;

import java.util.Locale;
import java.util.Scanner;

import exer01.entidades.Conta;
import exer01.entidades.ContaCorrente;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Conta cc = new ContaCorrente(1,1,"Doug", 100.0);
		System.out.println("Ap�s contrutor:");
		System.out.println(cc);
		cc.depositar(200);
		System.out.println("Ap�s m�todo depositar:");
		System.out.println(cc);
		cc.sacar(50);
		System.out.println("Ap�s m�todo sacar (ContaCorrente):");
		System.out.println(cc);
	
		teclado.close();
	}

}
