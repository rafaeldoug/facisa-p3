/**
 * 
 */
package br.cesed.si.p3.array.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.cesed.si.p3.array.MeuArrayList;

/**
 * @author Rafael Nascimento
 *
 */
class MeuArrayListTest {

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

	/**
	 * Teste de adição de elemento com tamanho de lista
	 */
	@Test
	void testAdd1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		/* Execução */

		meuArray.add(10);

		/* Verificação */

		assertEquals(1, meuArray.size());

	}

	/**
	 * Teste de adição de elemento com valor mesmo
	 */
	@Test
	void testAdd2() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		/* Execução */

		int elemento = 10;

		meuArray.add(elemento);

		/* Verificação */

		assertEquals(10, meuArray.getElementoIndex(0));

	}

	/**
	 * Teste de adição de elemento no index indicado, verificando tamanho do array
	 */
	@Test
	void testAddIndex1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execução */

		int index = 1;
		int elemento = 20;

		meuArray.addIndex(index, elemento);

		/* Verificação */

		int tamanhoArrayEsperado = 5;
		assertEquals(tamanhoArrayEsperado, meuArray.size());

	}

	/**
	 * Teste de adição de elemento no index indicado, verificando valor do elemento
	 * adicionado
	 */
	@Test
	void testAddIndex2() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execução */

		int index = 1;
		int elemento = 20;
		meuArray.addIndex(index, elemento);

		/* Verificação */

		assertEquals(20, meuArray.getElementoIndex(index));

	}

	/**
	 * Teste de Exception na remoção com index fora da lista
	 */
	@Test
	void testAddIndexException1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 3;
		int elemento = 30;
		
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			meuArray.addIndex(index, elemento);
		});

	}

	/**
	 * Teste de Exception na remoção com index negativo
	 */
	@Test
	void testAddIndexException2() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */
		
		int index = -1;
		int elemento = 30;

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.addIndex(index, elemento);
		});

	}

	/**
	 * Teste de remoção de elemento utilizando seu index verificando tamanho da
	 * lista
	 */
	@Test
	void testRemove1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Execução */

		meuArray.remove(1);

		/* Verificação */

		assertEquals(1, meuArray.size());

	}

	/**
	 * Teste de Exception na remoção com index fora da lista
	 */
	@Test
	void testRemoveException1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 3;

		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			meuArray.remove(index);
		});

	}

	/**
	 * Teste de Exception na remoção com index negativo
	 */
	@Test
	void testRemoveException2() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index =  -1;
		
		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.remove(index);
		});

	}

	/**
	 * Teste de retorno do elemento desejado utilizando seu index
	 */

	@Test
	void testGetElemento1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Execução */

		int actual = (int) meuArray.getElementoIndex(1);

		/* Verificação */

		assertEquals(20, actual);
	}

	/**
	 * Teste de Exception na remoção com index fora da lista
	 */
	@Test
	void testGetElementoException1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 3;
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			meuArray.getElementoIndex(index);
		});

	}

	/**
	 * Teste de Exception na remoção com index negativo
	 */
	@Test
	void testGetElementoException2() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = -1;
		
		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.getElementoIndex(index);
		});

	}

	/**
	 * Teste de alteração de elemento utilizando seu index
	 */
	@Test
	void testSetElemento1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Execução */
		
		int index = 1;
		int elemento = 30;
		meuArray.setElementoIndex(index, elemento);

		/* Verificação */

		assertEquals(elemento, meuArray.getElementoIndex(1));
	}

	/**
	 * Teste de Exception na alteração de elemento com index fora da lista
	 */
	@Test
	void testSetElementoException1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 3;
		
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			meuArray.getElementoIndex(index);
		});

	}

	/**
	 * Teste de Exception alteração de elemtno com index negativo
	 */
	@Test
	void testSetElementoException2() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = -1;
		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.getElementoIndex(index);
		});

	}

	/**
	 * Teste de limpeza de todos os elementos da lista
	 */
	@Test
	void testClear1() {

		/* Cenário */

		MeuArrayList meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);

		assertEquals(meuArray.size(), 3);

		/* Execução */

		meuArray.clear();

		/* Verificação */

		assertEquals(0, meuArray.size());
	}

}
