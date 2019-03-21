package exer01.entidades;

public final class ContaPoupanca extends Conta {

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param limite
	 * @param saldo
	 * @param valorLimite
	 */
	public ContaPoupanca(Integer agencia, Integer conta, String titular, Double limite, Double saldo,
			Double valorLimite) {
		super(agencia, conta, titular, limite, saldo, valorLimite);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param limite
	 * @param valorLimite
	 */
	public ContaPoupanca(Integer agencia, Integer conta, String titular, Double limite, Double valorLimite) {
		super(agencia, conta, titular, limite, valorLimite);
		// TODO Auto-generated constructor stub
	}
	
	

}
