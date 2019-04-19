/**
 * 
 */
package br.cesed.si.p3.array.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.cesed.si.p3.array.MeuArrayList;

/**
 * @author Rafael Nascimento
 * @see <a href="https://github.com/rafaeldoug/facisa-p3/tree/master/MeuArrayList/src/br/cesed/si/p3/array/tests">Github</a>
 *
 */

class MeuArrayListTest {

	private MeuArrayList meuArray; // variavel global para os teste

	/**
	 * Cria a lista vazia antes da execu��o de cada teste
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

		/* Cen�rio */

		this.meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

	}

	/**
	 * Limpa a lista depois da execu��o de cada teste
	 * 
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		meuArray.clear();
	}

	/**
	 * Teste de adicao de elemento com tamanho de lista
	 */
	@Test
	void testAdd1() {

		/* Execu��o */

		meuArray.add(10);

		/* Verifica��o */

		int tamanhoArray = 1;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de adicao de elemento com valor mesmo
	 */
	@Test
	void testAdd2() {

		/* Execu��o */

		int elemento = 10;

		meuArray.add(elemento);

		/* Verifica��o */

		assertEquals(meuArray.getElementoIndex(0), 10);

	}

	/**
	 * Teste de adicao de elemento no index indicado, verificando tamanho do array
	 */
	@Test
	void testAddIndex1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execu��o */

		int index = 1;
		int elemento = 20;

		meuArray.addIndex(index, elemento);

		/* Verifica��o */

		int tamanhoArray = 5;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de adicao de elemento no index indicado, verificando valor do elemento
	 * adicionado
	 */
	@Test
	void testAddIndex2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execu��o */

		int index = 1;
		int elemento = 20;
		meuArray.addIndex(index, elemento);

		/* Verifica��o */

		assertEquals(meuArray.getElementoIndex(index), 20);

	}

	/**
	 * Teste de adicao de elemento no index final da lista e quantidade de elementos
	 */
	@Test
	void testAddIndex3() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);

		/* Execu��o */

		int index = 2;
		int elemento = 20;

		meuArray.addIndex(index, elemento);

		/* Verifica��o */

		int tamanhoArray = 4;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de adicao de elemento no index final da lista e valor do elemento
	 * adicionado
	 */
	@Test
	void testAddIndex4() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);

		/* Execu��o */

		int index = 2;
		int elemento = 20;
		meuArray.addIndex(index, elemento);

		/* Verifica��o */

		assertEquals(meuArray.getElementoIndex(index), 20);

	}

	/**
	 * Teste de Exception na remo��o com index fora da lista
	 */
	@Test
	void testAddIndexException1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 3;
		int elemento = 30;

		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			meuArray.addIndex(index, elemento);
		});

	}

	/**
	 * Teste de Exception na remo��o com index negativo
	 */
	@Test
	void testAddIndexException2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = -1;
		int elemento = 30;

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.addIndex(index, elemento);
		});

	}

	/**
	 * Teste de remo��o de elemento utilizando seu index verificando tamanho da
	 * lista
	 */
	@Test
	void testRemove1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Execu��o */

		meuArray.remove(1);

		/* Verifica��o */

		int tamanhoArray = 1;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de Exception na remo��o com index fora da lista
	 */
	@Test
	void testRemoveException1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 3;

		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			meuArray.remove(index);
		});

	}

	/**
	 * Teste de Exception na remo��o com index negativo
	 */
	@Test
	void testRemoveException2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = -1;

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.remove(index);
		});

	}

	/**
	 * Teste de retorno do elemento desejado utilizando seu index
	 */

	@Test
	void testGetElemento1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 1; // indice referente ao valor 20

		assertEquals(meuArray.getElementoIndex(index), 20);
	}

	/**
	 * Teste de retorno iteravel
	 */

	@Test
	void testGetElemento2() {

		/* Cen�rio */

		meuArray.add(1);
		meuArray.add(2);
		meuArray.add(3);
		meuArray.add(4);
		meuArray.add(5);
		meuArray.add(6);

		/* Verifica��o */
		int valorElemento = 1; // representa o primeiro valor adicionado na lista
		for (int i = 0; i < meuArray.size(); i++) {
			meuArray.getElementoIndex(i);
			assertEquals(meuArray.getElementoIndex(i), valorElemento);
			valorElemento++; // incrementa para o proximo valor sequencial de teste na lista
		}

	}

	/**
	 * Teste de Exception na remo��o com index fora da lista
	 */
	@Test
	void testGetElementoException1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 3;
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			meuArray.getElementoIndex(index);
		});

	}

	/**
	 * Teste de Exception na remo��o com index negativo
	 */
	@Test
	void testGetElementoException2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = -1;

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.getElementoIndex(index);
		});

	}

	/**
	 * Teste de altera��o de elemento utilizando seu index
	 */
	@Test
	void testSetElemento1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Execu��o */

		int index = 1;
		int elemento = 30;
		meuArray.setElementoIndex(index, elemento);

		/* Verifica��o */

		assertEquals(meuArray.getElementoIndex(index), elemento);
	}

	/**
	 * Teste de Exception na altera��o de elemento com index fora da lista
	 */
	@Test
	void testSetElementoException1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 3;

		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			meuArray.getElementoIndex(index);
		});

	}

	/**
	 * Teste de Exception altera��o de elemtno com index negativo
	 */
	@Test
	void testSetElementoException2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

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

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);

		assertEquals(meuArray.size(), 3);

		/* Execu��o */

		meuArray.clear();

		/* Verifica��o */

		int tamanhoArray = 0;
		assertEquals(meuArray.size(), tamanhoArray);
	}

}
