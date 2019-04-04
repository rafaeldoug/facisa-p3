package exer01.entidades;

public abstract class Conta implements Tributavel {

	private int agencia;
	private int conta;
	private String titular;
	private double limite;
	protected double saldo;
	private double valorLimite;

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param saldo
	 * @param valorLimite
	 */
	public Conta(Integer agencia, Integer conta, String titular, Double saldo, Double valorLimite) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}

	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param valorLimite
	 */
	public Conta(Integer agencia, Integer conta, String titular, Double valorLimite) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.valorLimite = valorLimite;
	}
	
	/**
	 * Sacar montante afetando saldo
	 * 
	 * @param montante
	 */
	public abstract void sacar(double montante);
	
	/**
	 * Depositar montante afetanto o saldo
	 * 
	 * @param montante
	 */
	public void depositar(double montante) {
		saldo += montante;
	}
	

	/**
	 * Obtem a variavel agencia
	 *
	 * @return a variavel agencia
	 */
	public Integer getAgencia() {
		return agencia;
	}

	/**
	 * Ajusta a variavel agencia
	 *
	 * @param agencia a variavel agencia a ser ajustada
	 */
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	/**
	 * Obtem a variavel conta
	 *
	 * @return a variavel conta
	 */
	public Integer getConta() {
		return conta;
	}

	/**
	 * Ajusta a variavel conta
	 *
	 * @param conta a variavel conta a ser ajustada
	 */
	public void setConta(Integer conta) {
		this.conta = conta;
	}

	/**
	 * Obtem a variavel titular
	 *
	 * @return a variavel titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Ajusta a variavel titular
	 *
	 * @param titular a variavel titular a ser ajustada
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * Obtem a variavel limite
	 *
	 * @return a variavel limite
	 */
	public Double getLimite() {
		return limite;
	}

	/**
	 * Ajusta a variavel limite
	 *
	 * @param limite a variavel limite a ser ajustada
	 */
	public void setLimite(Double limite) {
		this.limite = limite;
	}

	/**
	 * Obtem a variavel valorLimite
	 *
	 * @return a variavel valorLimite
	 */
	public Double getValorLimite() {
		return valorLimite;
	}

	/**
	 * Ajusta a variavel valorLimite
	 *
	 * @param valorLimite a variavel valorLimite a ser ajustada
	 */
	public void setValorLimite(Double valorLimite) {
		this.valorLimite = valorLimite;
	}

	/**
	 * Obtem a variavel saldo
	 *
	 * @return a variavel saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", conta=" + conta + ", titular=" + titular + ", limite=" + limite
				+ ", saldo=" + saldo + ", valorLimite=" + valorLimite + "]";
	}

}
