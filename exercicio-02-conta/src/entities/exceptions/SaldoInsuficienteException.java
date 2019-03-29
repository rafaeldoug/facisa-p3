package entities.exceptions;

public class SaldoInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param recebe valor do saldo atual
	 */
	
	public SaldoInsuficienteException(double saldo) {
		super("Saldo insuficiente.\nSaldo atual: " + saldo); // imprime mensagem de erro + saldo atual
	}

}
