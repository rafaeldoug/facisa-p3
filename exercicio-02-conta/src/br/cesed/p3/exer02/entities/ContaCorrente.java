package br.cesed.p3.exer02.entities;

import br.cesed.p3.exer02.entities.exceptions.SaldoInsuficienteException;

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

	public void sacar(double valor) throws SaldoInsuficienteException {

		if (valor < 0) {
			throw new IllegalArgumentException("Não é possível utilizar valores negativos.");
		}
		if (valor > getSaldo()) {
			throw new SaldoInsuficienteException(getSaldo()); // parametro que retorna o saldo atual
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
	 * @param define valor maximo cedido pelo banco
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

}
