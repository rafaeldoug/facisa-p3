package exer01.entidades;

public final class ContaPoupanca extends Conta {

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param saldo
	 * @param valorLimite
	 */
	public ContaPoupanca(Integer agencia, Integer conta, String titular, Double saldo, Double valorLimite) {
		super(agencia, conta, titular, saldo, valorLimite);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param valorLimite
	 */
	public ContaPoupanca(Integer agencia, Integer conta, String titular, Double valorLimite) {
		super(agencia, conta, titular, valorLimite);
		// TODO Auto-generated constructor stub
	}


	

}
