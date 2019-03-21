package exer01.entidades;

public final class ContaCorrente extends Conta{

	
	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param limite
	 * @param saldo
	 * @param valorLimite
	 */
	public ContaCorrente(Integer agencia, Integer conta, String titular, Double limite, Double saldo,
			Double valorLimite) {
		super(agencia, conta, titular, limite, saldo, valorLimite);
	}

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param limite
	 * @param valorLimite
	 */
	public ContaCorrente(Integer agencia, Integer conta, String titular, Double limite, Double valorLimite) {
		super(agencia, conta, titular, limite, valorLimite);
	}
	
	

}
