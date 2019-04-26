/**	
 * Contem testes unitarios para todos os metodos da classe MeuArrayList
 * 
 */
package br.cesed.si.p3.array.tests;

import static org.junit.Assert.assertFalse;
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
	 * Teste de adicao de elemento com verificacao no tamanho de lista
	 */
	@Test
	void testAdd1() {

		/* Execu��o */

		meuArray.add(10);

		/* Verifica��o */

		int tamanhoArray = 1;
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao com verificacao do valor do elemento
	 */
	@Test
	void testAdd2() {

		/* Execu��o */

		int elemento = 10;

		meuArray.add(elemento);

		/* Verifica��o */

		assertEquals(10, meuArray.getElemento(0));

	}

	/**
	 * Teste de adicao de elemento null
	 */
	@Test
	void testAdd3() {

		/* Execu��o */

		meuArray.add(null);

		/* Verifica��o */

		assertEquals(0, meuArray.size());

	}

	/**
	 * Teste de adicao de elemento null, com lista n�o vazia
	 */
	@Test
	void testAdd4() {

		/* Execu��o */

		meuArray.add(10);
		meuArray.add(null);

		/* Verifica��o */

		assertEquals(1, meuArray.size());

	}

	/**
	 * Teste de adicao de elemento com tamanho da lista no seu limite
	 */
	@Test
	void testAdd5() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);

		/* Execu��o */

		meuArray.add(40);

		/* Verifica��o */

		int tamanhoArray = 4;
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao de elementos apenas do mesmo tipo, j� contendo Integer e
	 * tentando adicionar um String
	 */
	@Test
	void testAdd6() {

		/* Cen�rio */

		int valorInt = 10;
		meuArray.add(valorInt);

		/* Verifica��o */

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			meuArray.add("string");
		});
	}

	/**
	 * Teste de adicao de elementos apenas do mesmo tipo, j� contendo String e
	 * tentando adicionar um Integer
	 */
	@Test
	void testAdd7() {

		/* Cen�rio */

		meuArray.add("string");

		/* Verifica��o */

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
		assertEquals(tamanhoArray, meuArray.size());

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

		assertEquals(20, meuArray.getElemento(index));

	}

	/**
	 * Teste de adicao de elemento utilizando index do final da lista e verificando
	 * quantidade de elementos
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
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao de elemento utilizando ultimo index da lista, for�ando
	 * expans�o, e verificando valor do elemento adicionado
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

		assertEquals(20, meuArray.getElemento(index));

	}

	/**
	 * Teste de Exception na adi��o utilizando index fora do limite da lista
	 */
	@Test
	void testAddIndexException1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 3;
		int elemento = 30;

		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			meuArray.addIndex(index, elemento);
		});

	}

	/**
	 * Teste de Exception na adi��o utilizando index negativo
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
	 * Teste de Exception na adi��o utilizando objeto de tipo diferente do incial
	 */
	@Test
	void testAddIndexException3() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = -1;
		String elemento = "string";

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.addIndex(index, elemento);
		});

	}

	/**
	 * Teste de adicao de lista � atual com a lista original na sua capacidade
	 * maxima
	 */
	@Test
	void testAddAll1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		Object[] array = { 31, 32, 33 };

		/* Execu��o */

		meuArray.addAll(array);

		/* Verifica��o */

		int tamanhoArray = 6;
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao de lista � lista atual com apenas um elemento
	 */
	@Test
	void testAddAll2() {

		/* Cen�rio */

		meuArray.add(10);
		Object[] array = { 31, 32, 33 };

		/* Execu��o */

		meuArray.addAll(array);

		/* Verifica��o */

		int tamanhoArray = 4;
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao de lista � lista atual com elementos de tipo diferente
	 */
	@Test
	void testAddAllException1() {

		/* Cen�rio */

		meuArray.add(10);
		Object[] array = { "eu", "sou", "string" };

		/* Verifica��o */

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			meuArray.addAll(array);
			;
		});

	}

	/**
	 * Teste de remo��o de elemento utilizando seu index e verificando tamanho da
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
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de Exception na remo��o utilizando index fora do limite da lista
	 */
	@Test
	void testRemoveException1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 3;

		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			meuArray.remove(index);
		});

	}

	/**
	 * Teste de Exception na remo��o utilizando index negativo
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
	 * Teste de retorno do elemento desejado utilizando index
	 */

	@Test
	void testGetElemento1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 1; // indice referente ao valor 20

		assertEquals(20, meuArray.getElemento(index));
	}

	/**
	 * Teste de retorno de elementos utilizando iteracao
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
			meuArray.getElemento(i);
			assertEquals(valorElemento, meuArray.getElemento(i));
			valorElemento++; // incrementa para o proximo valor sequencial de teste na lista
		}

	}

	/**
	 * Teste de Exception na remo��o utilizando index fora da lista
	 */
	@Test
	void testGetElementoException1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 3;
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			meuArray.getElemento(index);
		});

	}

	/**
	 * Teste de Exception na remo��o utilizando index negativo
	 */
	@Test
	void testGetElementoException2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = -1;

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.getElemento(index);
		});

	}

	/**
	 * Teste de retorno do index do elemento escolhido, considerando que conste na
	 * lista
	 * 
	 */
	@Test
	void testIndexOf1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20); // elemento testado
		meuArray.add(30);
		meuArray.add(40);

		/* Verifica��o */

		int index = 1; // index do elemento desejado

		assertEquals(index, meuArray.indexOf(20));
	}

	/**
	 * Teste de retorno do index do elemento que n�o se encontra na lista
	 * 
	 */
	@Test
	void testIndexOf2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20); // elemento testado
		meuArray.add(30);
		meuArray.add(40);

		/* Verifica��o */

		int index = -1; // index do elemento desejado

		assertEquals(index, meuArray.indexOf(100));
	}

	/**
	 * Teste de retorno do index da �ltima apari��o do elemento escolhido na lista
	 * 
	 */
	@Test
	void testLastIndexOf1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20); // elemento buscado
		meuArray.add(30);
		meuArray.add(20); // ultimo do mesmo elemento buscado

		/* Verifica��o */

		int index = 3; // index do elemento desejado

		assertEquals(index, meuArray.lastIndexOf(20));
	}

	/**
	 * Teste de retorno do index do elemento que n�o se encontra na lista
	 */
	@Test
	void testLastIndexOf2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20); // elemento buscado
		meuArray.add(30);
		meuArray.add(20); // ultimo do mesmo elemento buscado

		/* Verifica��o */

		int index = -1; // index do elemento desejado

		assertEquals(index, meuArray.lastIndexOf(100));
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
		meuArray.setElemento(index, elemento);

		/* Verifica��o */

		assertEquals(30, meuArray.getElemento(index));
	}

	/**
	 * Teste de altera��o de elemento utilizando seu index, com elemento nulo
	 */
	@Test
	void testSetElemento2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Execu��o */

		int index = 1;
		int elementoAtual = 20; // valor do elemento adicionado inicialmente
		meuArray.setElemento(index, null);

		/* Verifica��o */

		assertEquals(elementoAtual, meuArray.getElemento(index));
		assertTrue(meuArray.getElemento(index) != null);
	}

	/**
	 * Teste de Exception na altera��o de elemento utilizando index fora do limite
	 * da lista
	 */
	@Test
	void testSetElementoException1() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

		int index = 3;

		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			meuArray.getElemento(index);
		});

	}

	/**
	 * Teste de Exception na altera��o de elemento utilizando index negativo
	 */
	@Test
	void testSetElementoException2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);

		/* Verifica��o */

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

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);

		assertEquals(meuArray.size(), 3);

		/* Verifica��o */

		assertFalse(meuArray.isEmpty()); // nao deve estar vazia
	}

	/**
	 * Teste de retorno de lista vazia, sendo iniciada ja nao contendo elementos
	 */
	@Test
	void testIsEmpty2() {

		/* Cen�rio */

		// nenhum elemento adicionado
		assertEquals(meuArray.size(), 0);

		/* Verifica��o */

		assertTrue(meuArray.isEmpty()); // deve estar vazia
	}

	/**
	 * Teste de c�pia da lista
	 */
	@Test
	void testClone1() {

		/* Cen�rio */

		meuArray.add(10);

		/* Execu��o */

		Object[] copiaArray = (Object[]) meuArray.clone();

		/* Verifica��o */
		
		assertEquals(copiaArray.length, meuArray.getCapacidadeLista());
		for (int i = 0; i < meuArray.size(); i++) {
			assertEquals(copiaArray[i], meuArray.getElemento(i)); 
		};

	}
	
	/**
	 * Teste de clone da lista com capacidade incial estourada
	 */
	@Test
	void testClone2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execu��o */

		Object[] copiaArray = (Object[]) meuArray.clone();

		/* Verifica��o */
		
		assertEquals(copiaArray.length, meuArray.getCapacidadeLista());
		for (int i = 0; i < meuArray.size(); i++) {
			assertEquals(copiaArray[i], meuArray.getElemento(i)); 
		};

	}


	/**
	 * Teste de elemento buscado contido na lista, sendo verdade
	 */
	@Test
	void testContains1() {

		/* Cen�rio */

		int elementoNaLista = 10;
		meuArray.add(elementoNaLista);

		/* Verifica��o */

		int elementoBuscado = 10;
		assertTrue(meuArray.contains(elementoBuscado));
	}

	/**
	 * Teste de elemento buscado contido na lista, sendo falso
	 */
	@Test
	void testContains2() {

		/* Cen�rio */

		int elementoNaLista = 10;
		meuArray.add(elementoNaLista);

		/* Verifica��o */

		int elementoBuscado = 20;
		assertFalse(meuArray.contains(elementoBuscado));
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
		assertEquals(tamanhoArray, meuArray.size());
	}

	/**
	 * Teste de limpeza de todos os elementos, com lista acima do tamanho inicial
	 */
	@Test
	void testClear2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(20);
		meuArray.add(30);
		meuArray.add(40);

		assertEquals(meuArray.size(), 4);

		/* Execu��o */

		meuArray.clear();

		/* Verifica��o */

		int tamanhoArray = 0;
		assertEquals(tamanhoArray, meuArray.size());
	}

	/**
	 * Teste de quantidade de elementos na lista
	 */
	@Test
	void testSize1() {

		/* Execu��o */

		meuArray.add(10);

		/* Verifica��o */

		int tamanhoArray = 1;
		assertEquals(tamanhoArray, meuArray.size());
	}

	/**
	 * Teste a diminui��o do tamanho da lista para o tamanho exato de elementos na
	 * mesma
	 * 
	 */
	@Test
	void testTrimToSize1() {

		/* Cen�rio */

		meuArray.add(10);

		/* Execu��o */

		meuArray.trimToSize();

		/* Verifica��o */

		int tamanhoArray = 1;
		assertEquals(tamanhoArray, meuArray.getCapacidadeLista());
	}

	/**
	 * Teste a diminui��o do tamanho da lista, com multiplos elementos, para o
	 * tamanho exato de elementos na mesma
	 * 
	 */
	@Test
	void testTrimToSize2() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execu��o */

		meuArray.trimToSize();

		/* Verifica��o */

		int tamanhoArray = 4;
		assertEquals(tamanhoArray, meuArray.getCapacidadeLista());
	}

	/**
	 * Teste a diminui��o do tamanho da lista, sem adicionar elementos, logo ap�s
	 * adiciona e executa novamente o trim
	 * 
	 */
	@Test
	void testTrimToSize3() {

		/* Cen�rio */

		meuArray.trimToSize();
		assertEquals(0, meuArray.getCapacidadeLista());

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execu��o */

		meuArray.trimToSize();

		/* Verifica��o */

		int tamanhoArray = 4;
		assertEquals(tamanhoArray, meuArray.getCapacidadeLista());
	}

	/**
	 * Teste a diminui��o do tamanho da lista com a lista j� com o tamanho igual ao
	 * numero de elementos
	 * 
	 */
	@Test
	void testTrimToSize4() {

		/* Cen�rio */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);

		/* Execu��o */

		meuArray.trimToSize();

		/* Verifica��o */

		int tamanhoArray = 3;
		assertEquals(tamanhoArray, meuArray.getCapacidadeLista());
	}

}
