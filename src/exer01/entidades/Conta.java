package exer01.entidades;

public abstract class Conta {
	
	private Integer agencia;
	private Integer conta;
	private String titular;
	private Double limite;
	private Double saldo = 0.0;
	private Double valorLimite;
	
	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param saldo
	 */
	public Conta(Integer agencia, Integer conta, String titular, Double saldo) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	/**
	 * @param agencia
	 * @param conta
	 * @param titular
	 */
	public Conta(Integer agencia, Integer conta, String titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	/**
	 * @return the agencia
	 */
	public Integer getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the conta
	 */
	public Integer getConta() {
		return conta;
	}

	/**
	 * @param conta the conta to set
	 */
	public void setConta(Integer conta) {
		this.conta = conta;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the limite
	 */
	public Double getLimite() {
		return limite;
	}

	/**
	 * @return the valorLimite
	 */
	public Double getValorLimite() {
		return valorLimite;
	}

	/**
	 * @param valorLimite the valorLimite to set
	 * @return 
	 */
	public void setValorLimite(Double valor) {
		this.valorLimite = valor;
	}
	
	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}
	
	public void sacar(Double valor) {
		saldo -= valor;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", conta=" + conta + ", titular=" + titular + ", limite=" + limite
				+ ", saldo=" + saldo + ", valorLimite=" + valorLimite + "]";
	}
	


}
