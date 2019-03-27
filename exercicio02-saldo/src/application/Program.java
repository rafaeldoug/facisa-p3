package application;

import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) throws Exception {

		ContaCorrente cc = new ContaCorrente(300.0, 0.0, 1000.0);

		try {
			cc.setValorLimite(-600.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			cc.depositar(-200.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			cc.sacar(-10.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(cc);
	}

}
