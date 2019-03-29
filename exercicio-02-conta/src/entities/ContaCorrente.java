package entities;

import entities.exceptions.SaldoInsuficienteException;

public class ContaCorrente {

	private Double limite;
	private Double saldo;
	private Double valorLimite;

	/**
	 * @param Limite disponivel na conta
	 * @param Saldo  disponivel na conta
	 * @param Limite maximo oferecido pelo banco
	 */
	public ContaCorrente(Double limite, Double saldo, Double valorLimite) {
		super();
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}

	/**
	 * @param Limite disponivel na conta
	 * @param Limite maximo oferecido pelo banco
	 */
	public ContaCorrente(Double limite, Double valorLimite) {
		super();
		this.limite = limite;
		this.valorLimite = valorLimite;
	}

	public void sacar(double valor) throws Exception {

		if (valor < 0) {
			throw new IllegalArgumentException("Não é possível utilizar valores negativos.");
		}
		if (valor > getSaldo()) {
			throw new SaldoInsuficienteException("Saldo na conta insuficiente");
		} else {
			saldo -= valor;
		}

	}

	public void depositar(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Não é possível utilizar valores negativos.");
		} else {
			saldo += valor;
		}
	}

	/**
	 * @return the limite
	 */
	public Double getLimite() {
		return limite;
	}

	/**
	 * @param limite the limite to set
	 */
	public void setLimite(Double limite) {
		this.limite = limite;
	}

	/**
	 * @return the valorLimite
	 */
	public Double getValorLimite() {
		return valorLimite;
	}

	/**
	 * @param valorLimite the valorLimite to set
	 * @throws Exception
	 */
	public void setValorLimite(Double valorLimite) {

		if (valorLimite < 0) {
			throw new IllegalArgumentException("Não é possível utilizar valores negativos.");
		} else {
			this.valorLimite = valorLimite;
		}
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContaCorrente [limite=" + limite + ", saldo=" + saldo + ", valorLimite=" + valorLimite + "]";
	}

}
