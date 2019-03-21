package exer01.entidades;

public final class ContaPoupanca extends Conta {

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param saldo
	 */
	public ContaPoupanca(Integer agencia, Integer conta, String titular, Double saldo) {
		super(agencia, conta, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 */
	public ContaPoupanca(Integer agencia, Integer conta, String titular) {
		super(agencia, conta, titular);
		// TODO Auto-generated constructor stub
	}


	

}
