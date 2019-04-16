package exer01.entidades;

public final class ContaCorrente extends Conta {

	/**
	 * @param agencia Indica numero da agencia
	 * @param conta Indica numero da conta
	 * @param titular Indica nome do titular da conta
	 * @param saldo Indica saldo disponivel
	 * @param valorLimite Indica valor limite cedido pelo banco para o cliente
	 */
	public ContaCorrente(Integer agencia, Integer conta, String titular, Double saldo, Double valorLimite) {
		super(agencia, conta, titular, saldo, valorLimite);
	}

	/**
	 * @param agencia Indica numero da agencia
	 * @param conta Indica numero da conta
	 * @param titular Indica nome do titular da conta
	 * @param valorLimite Indica valor limite cedido pelo banco para o cliente
	 */
	public ContaCorrente(Integer agencia, Integer conta, String titular, Double valorLimite) {
		super(agencia, conta, titular, valorLimite);
	}

	/**
	 * Metodo para retirada de montante, alterando o saldo e descontando tributo
	 * 
	 * @param montante Valor a ser sacado
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
