/**
 * 
 */
package br.cesed.p3.exer02.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.cesed.p3.exer02.entities.ContaCorrente;
import br.cesed.p3.exer02.entities.exceptions.SaldoInsuficienteException;

/**
 * @author Rafael Nascimento
 *
 */
class ContaCorrenteTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	// testa lancamento de excecao para saldo insuficiente
	@Test
	void testSaldoInfuficienteException() {

		ContaCorrente cc = new ContaCorrente(100.0, 0.0, 300.0);

		Assertions.assertThrows(SaldoInsuficienteException.class, () -> {
			cc.sacar(10);
			;
		});

	}
	
	// testa tentativa de saque de valor negativo
	@Test
	void testSacarValorNegativoException() {

		ContaCorrente cc = new ContaCorrente(100.0, 100.0, 300.0);

		Assertions.assertThrows(Exception.class, () -> {
			cc.sacar(-10.0);
			;
		});

	}

	// testa tentativa de deposito de valor negativo
	@Test
	void testDepositarValorNegativoException() {

		ContaCorrente cc = new ContaCorrente(100.0, 100.0, 300.0);

		Assertions.assertThrows(Exception.class, () -> {
			cc.depositar(-10.0);
			;
		});

	}

	// testa set de valor limite com valor negativo
	@Test
	void testSetValorLimiteNegativoException() {

		ContaCorrente cc = new ContaCorrente(100.0, 100.0, 300.0);

		Assertions.assertThrows(Exception.class, () -> {
			cc.setValorLimite(-10.0);
			;
		});

	}

}
