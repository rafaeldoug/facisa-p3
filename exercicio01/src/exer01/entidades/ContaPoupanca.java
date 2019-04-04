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
	}

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param valorLimite
	 */
	public ContaPoupanca(Integer agencia, Integer conta, String titular, Double valorLimite) {
		super(agencia, conta, titular, valorLimite);
	}

	@Override
	public double getTributavel() {
		return TRIBUTO_CP;
	}

	@Override
	public void sacar(double montante) {
		saldo -= montante;
	}


	

}
