package exer01.entidades;

public final class ContaCorrente extends Conta {

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param saldo
	 * @param valorLimite
	 */
	public ContaCorrente(Integer agencia, Integer conta, String titular, Double saldo, Double valorLimite) {
		super(agencia, conta, titular, saldo, valorLimite);
	}

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param valorLimite
	 */
	public ContaCorrente(Integer agencia, Integer conta, String titular, Double valorLimite) {
		super(agencia, conta, titular, valorLimite);
	}

	/**
	 * Metodo para retirada de montante, alterando o saldo e descontando tributo
	 */
	@Override
	public void sacar(double montante) {
		saldo -= montante;
		saldo -= getTributavel();
	}

	@Override
	public double getTributavel() {
		return TRIBUTO_CC;
	}

}
