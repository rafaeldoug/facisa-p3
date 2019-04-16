/**
 * 
 */
package br.cesed.p3.exer02_b.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.cesed.p3.exer02_b.entities.exceptions.FahrenheitException;
import br.cesed.p3.exer02_b.entities.util.Utils;

/**
 * @author Rafael Nascimento
 *
 */
class UtilsTest {

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

	// testa se valor da temparatura esta abaixo de zero absoluto
	@Test
	void testZeroAbsolutoException() {
		
		Assertions.assertThrows(FahrenheitException.class, () -> {
			Utils.toCelsius(-459.68);
		});
		
	}

}
