package br.com.itau.taa;

import javax.swing.JOptionPane;

import br.com.itau.taa.exceptions.SaldoInsuficienteException;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1, 1, "Sebozo");
		conta.depositar(50.0);
		try {
			conta.sacar(45);
		} catch (SaldoInsuficienteException e) {
			JOptionPane.showMessageDialog(null, "Ei, " + conta.getTitular() + "!" + " TÁ LISO QUE NEM EU...");
		}
		
		System.out.println(conta);

	}

}
