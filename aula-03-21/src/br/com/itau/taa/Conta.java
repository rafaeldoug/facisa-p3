package br.com.itau.taa;


import br.com.itau.taa.exceptions.SaldoInsuficienteException;

public class Conta {

	private int numeroAgencia;

	private int numeroConta;

	private double saldo;

	private String titular;

	/**
	 * @param numeroAgencia
	 * @param numeroConta
	 * @param saldo
	 * @param titular
	 */
	public Conta(int numeroAgencia, int numeroConta, double saldo, String titular) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.titular = titular;
	}

	/**
	 * @param numeroAgencia
	 * @param numeroConta
	 * @param titular
	 */
	public Conta(int numeroAgencia, int numeroConta, String titular) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	/**
	 * @return the numeroAgencia
	 */
	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	/**
	 * @param numeroAgencia the numeroAgencia to set
	 */
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	/**
	 * @return the numeroConta
	 */
	public int getNumeroConta() {
		return numeroConta;
	}

	/**
	 * @param numeroConta the numeroConta to set
	 */
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
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
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	// metodo repassado para quem chama o metodo e deve tratar
	public void sacar(double montante) throws SaldoInsuficienteException {

		if (montante > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente.\nSaldo atual: " + saldo);
		} else {
			saldo -= montante;
		}
	}

	public void depositar(double montante) {
		saldo += montante;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conta [numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo
				+ ", titular=" + titular + "]";
	}

}
