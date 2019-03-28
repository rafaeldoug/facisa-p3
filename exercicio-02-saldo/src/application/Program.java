package application;

import entities.ContaCorrente;
import entities.exceptions.SaldoInsuficienteException;

public class Program {

	public static void main(String[] args) throws Exception {

		ContaCorrente cc = new ContaCorrente(300.0, 0.0, 1000.0);

		try {
			cc.setValorLimite(600.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			cc.depositar(200.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			cc.sacar(210.0);	
		} catch (SaldoInsuficienteException e) { // excecao chamada em caso de saldo insuficiente
			System.out.println(e.getMessage());
			System.out.println("Saldo atual: " + cc.getSaldo()); // metodo chamado para mostrar o saldo atual em caso de excecao ser lancada
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(cc);
	}

}
