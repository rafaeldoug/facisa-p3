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

	
}
