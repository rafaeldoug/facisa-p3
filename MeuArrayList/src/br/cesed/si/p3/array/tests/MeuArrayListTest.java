/**	
 * Contem testes unitarios para todos os metodos da classe MeuArrayList
 * 
 */
package br.cesed.si.p3.array.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.cesed.si.p3.array.MeuArrayList;

/**
 * @author Rafael Nascimento
 * @see <a href=
 *      "https://github.com/rafaeldoug/facisa-p3/tree/master/MeuArrayList/src/br/cesed/si/p3/array/tests">Github</a>
 *
 */

class MeuArrayListTest {

	private MeuArrayList meuArray; // parametro global para os testes

	/**
	 * Cria a lista vazia antes da execução de cada teste
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

		/* Cenário */

		this.meuArray = new MeuArrayList();
		assertEquals(meuArray.size(), 0);

	}

	/**
	 * Limpa a lista depois da execução de cada teste
	 * 
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		meuArray.clear();
	}

	/**
	 * Teste de adicao de elemento com verificacao no tamanho de lista
	 */
	@Test
	void testAdd1() {

		/* Execução */

		meuArray.add(10);

		/* Verificação */

		int tamanhoArray = 1;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de adicao de elemento com verificacao do valor
	 */
	@Test
	void testAdd2() {

		/* Execução */

		int elemento = 10;

		meuArray.add(elemento);

		/* Verificação */

		assertEquals(meuArray.getElemento(0), 10);

	}

	/**
	 * Teste de adicao de elemento null
	 */
	@Test
	void testAdd3() {

		/* Execução */

		meuArray.add(null);

		/* Verificação */

		assertEquals(meuArray.size(), 0);

	}

	/**
	 * Teste de adicao de elemento null, com lista contendo um elemento
	 */
	@Test
	void testAdd4() {

		/* Execução */

		meuArray.add(10);
		meuArray.add(null);

		/* Verificação */

		assertEquals(meuArray.size(), 1);

	}

	/**
	 * Teste de adicao de elemento com tamanho da lista no seu limite
	 */
	@Test
	void testAdd5() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);

		/* Execução */

		meuArray.add(40);

		/* Verificação */

		int tamanhoArray = 4;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de adicao de elementos apenas do mesmo tipo, sendo de Integer para
	 * String
	 */
	@Test
	void testAdd6() {

		/* Cenário */
		
		int valorInt = 10;
		meuArray.add(valorInt);

		/* Verificação */

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			meuArray.add("string");
		});
	}

	/**
	 * Teste de adicao de elementos apenas do mesmo tipo, sendo de String para
	 * Integer
	 */
	@Test
	void testAdd7() {

		/* Cenário */

		meuArray.add("string");

		/* Verificação */

		int valorInt = 20;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			meuArray.add(valorInt);
		});
	}

	/**
	 * Teste de adicao de elemento no index indicado, verificando tamanho da lista
	 */
	@Test
	void testAddIndex1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execução */

		int index = 1;
		int elemento = 20;

		meuArray.addIndex(index, elemento);

		/* Verificação */

		int tamanhoArray = 5;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de adicao de elemento no index indicado, verificando valor do elemento
	 * adicionado
	 */
	@Test
	void testAddIndex2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execução */

		int index = 1;
		int elemento = 20;
		meuArray.addIndex(index, elemento);

		/* Verificação */

		assertEquals(meuArray.getElemento(index), 20);

	}

	/**
	 * Teste de adicao de elemento utilizando index do final da lista e verificando
	 * quantidade de elementos
	 */
	@Test
	void testAddIndex3() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);

		/* Execução */

		int index = 2;
		int elemento = 20;

		meuArray.addIndex(index, elemento);

		/* Verificação */

		int tamanhoArray = 4;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de adicao de elemento utilizando index do final da lista e verificando
	 * valor do elemento adicionado
	 */
	@Test
	void testAddIndex4() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);

		/* Execução */

		int index = 2;
		int elemento = 20;
		meuArray.addIndex(index, elemento);

		/* Verificação */

		assertEquals(meuArray.getElemento(index), 20);

	}

	/**
	 * Teste de Exception na remoção utilizando index fora do limite da lista
	 */
	@Test
	void testAddIndexException1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 3;
		int elemento = 30;

		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			meuArray.addIndex(index, elemento);
		});

	}

	/**
	 * Teste de Exception na remoção utilizando index negativo
	 */
	@Test
	void testAddIndexException2() {

		/* Cenário */

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
	 * Teste de remoção de elemento utilizando seu index e verificando tamanho da
	 * lista
	 */
	@Test
	void testRemove1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Execução */

		meuArray.remove(1);

		/* Verificação */

		int tamanhoArray = 1;
		assertEquals(meuArray.size(), tamanhoArray);

	}

	/**
	 * Teste de Exception na remoção utilizando index fora do limite da lista
	 */
	@Test
	void testRemoveException1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 3;

		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			meuArray.remove(index);
		});

	}

	/**
	 * Teste de Exception na remoção utilizando index negativo
	 */
	@Test
	void testRemoveException2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = -1;

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.remove(index);
		});

	}

	/**
	 * Teste de retorno do elemento desejado utilizando index
	 */

	@Test
	void testGetElemento1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 1; // indice referente ao valor 20

		assertEquals(meuArray.getElemento(index), 20);
	}

	/**
	 * Teste de retorno de elementos utilizando iteracao
	 */

	@Test
	void testGetElemento2() {

		/* Cenário */

		meuArray.add(1);
		meuArray.add(2);
		meuArray.add(3);
		meuArray.add(4);
		meuArray.add(5);
		meuArray.add(6);

		/* Verificação */
		int valorElemento = 1; // representa o primeiro valor adicionado na lista
		for (int i = 0; i < meuArray.size(); i++) {
			meuArray.getElemento(i);
			assertEquals(meuArray.getElemento(i), valorElemento);
			valorElemento++; // incrementa para o proximo valor sequencial de teste na lista
		}

	}

	/**
	 * Teste de Exception na remoção utilizando index fora da lista
	 */
	@Test
	void testGetElementoException1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 3;
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			meuArray.getElemento(index);
		});

	}

	/**
	 * Teste de Exception na remoção utilizando index negativo
	 */
	@Test
	void testGetElementoException2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = -1;

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.getElemento(index);
		});

	}

	/**
	 * Teste de retorno do index do elemento escolhido, considerando que conste na
	 * lista
	 * 
	 * @throws Exception
	 */

	@Test
	void testGetElementoIndex1() throws Exception {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20); // elemento testado
		meuArray.add(30);
		meuArray.add(40);

		/* Verificação */

		int index = 1; // index do elemento desejado

		assertEquals(meuArray.getElementoIndex(20), index);
	}

	/**
	 * Teste de Exception com elemento que nao consta na lista
	 * 
	 * @throws Exception
	 */

	@Test
	void testGetElementoIndexException1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int elemento = 30; // elemento que nao se encontra na lista

		Assertions.assertThrows(Exception.class, () -> {
			meuArray.getElementoIndex(elemento);
		});
	}

	/**
	 * Teste de alteração de elemento utilizando seu index
	 */
	@Test
	void testSetElemento1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Execução */

		int index = 1;
		int elemento = 30;
		meuArray.setElemento(index, elemento);

		/* Verificação */

		assertEquals(meuArray.getElemento(index), 30);
	}

	/**
	 * Teste de alteração de elemento utilizando seu index, com elemento nulo
	 */
	@Test
	void testSetElemento2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Execução */

		int index = 1;
		int elementoAtual = 20; // valor do elemento adicionado inicialmente
		meuArray.setElemento(index, null);

		/* Verificação */

		assertEquals(meuArray.getElemento(index), elementoAtual);
		assertTrue(meuArray.getElemento(index) != null);
	}

	/**
	 * Teste de Exception na alteração de elemento utilizando index fora do limite
	 * da lista
	 */
	@Test
	void testSetElementoException1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = 3;

		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			meuArray.getElemento(index);
		});

	}

	/**
	 * Teste de Exception na alteração de elemento utilizando index negativo
	 */
	@Test
	void testSetElementoException2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = -1;
		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.getElemento(index);
		});

	}

	/**
	 * Teste de retorno de lista vazia, contendo elementos
	 */
	@Test
	void testIsEmpty1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);

		assertEquals(meuArray.size(), 3);

		/* Verificação */

		assertEquals(meuArray.isEmpty(), false); // nao deve estar vazia
	}

	/**
	 * Teste de retorno de lista vazia, sendo iniciada ja nao contendo elementos
	 */
	@Test
	void testIsEmpty2() {

		/* Cenário */

		// nenhum elemento adicionado
		assertEquals(meuArray.size(), 0);

		/* Verificação */

		assertEquals(meuArray.isEmpty(), true); // deve estar vazia
	}

	/**
	 * Teste de limpeza de todos os elementos da lista
	 */
	@Test
	void testClear1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);

		assertEquals(meuArray.size(), 3);

		/* Execução */

		meuArray.clear();

		/* Verificação */

		int tamanhoArray = 0;
		assertEquals(meuArray.size(), tamanhoArray);
	}

	/**
	 * Teste de limpeza de todos os elementos, com lista acima do tamanho inicial
	 */
	@Test
	void testClear2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);
		meuArray.add(40);

		assertEquals(meuArray.size(), 4);

		/* Execução */

		meuArray.clear();

		/* Verificação */

		int tamanhoArray = 0;
		assertEquals(meuArray.size(), tamanhoArray);
	}

}
