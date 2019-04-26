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
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao com verificacao do valor do elemento
	 */
	@Test
	void testAdd2() {

		/* Execução */

		int elemento = 10;

		meuArray.add(elemento);

		/* Verificação */

		assertEquals(10, meuArray.getElemento(0));

	}

	/**
	 * Teste de adicao de elemento null
	 */
	@Test
	void testAdd3() {

		/* Execução */

		meuArray.add(null);

		/* Verificação */

		assertEquals(0, meuArray.size());

	}

	/**
	 * Teste de adicao de elemento null, com lista não vazia
	 */
	@Test
	void testAdd4() {

		/* Execução */

		meuArray.add(10);
		meuArray.add(null);

		/* Verificação */

		assertEquals(1, meuArray.size());

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
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao de elementos apenas do mesmo tipo, já contendo Integer e
	 * tentando adicionar um String
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
	 * Teste de adicao de elementos apenas do mesmo tipo, já contendo String e
	 * tentando adicionar um Integer
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
		assertEquals(tamanhoArray, meuArray.size());

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

		assertEquals(20, meuArray.getElemento(index));

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
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao de elemento utilizando ultimo index da lista, forçando
	 * expansão, e verificando valor do elemento adicionado
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

		assertEquals(20, meuArray.getElemento(index));

	}

	/**
	 * Teste de Exception na adição utilizando index fora do limite da lista
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
	 * Teste de Exception na adição utilizando index negativo
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
	 * Teste de Exception na adição utilizando objeto de tipo diferente do incial
	 */
	@Test
	void testAddIndexException3() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20);

		/* Verificação */

		int index = -1;
		String elemento = "string";

		Assertions.assertThrows(NumberFormatException.class, () -> {
			meuArray.addIndex(index, elemento);
		});

	}

	/**
	 * Teste de adicao de lista à atual com a lista original na sua capacidade
	 * maxima
	 */
	@Test
	void testAddAll1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		Object[] array = { 31, 32, 33 };

		/* Execução */

		meuArray.addAll(array);

		/* Verificação */

		int tamanhoArray = 6;
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao de lista à lista atual com apenas um elemento
	 */
	@Test
	void testAddAll2() {

		/* Cenário */

		meuArray.add(10);
		Object[] array = { 31, 32, 33 };

		/* Execução */

		meuArray.addAll(array);

		/* Verificação */

		int tamanhoArray = 4;
		assertEquals(tamanhoArray, meuArray.size());

	}

	/**
	 * Teste de adicao de lista à lista atual com elementos de tipo diferente
	 */
	@Test
	void testAddAllException1() {

		/* Cenário */

		meuArray.add(10);
		Object[] array = { "eu", "sou", "string" };

		/* Verificação */

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			meuArray.addAll(array);
			;
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
		assertEquals(tamanhoArray, meuArray.size());

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

		assertEquals(20, meuArray.getElemento(index));
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
			assertEquals(valorElemento, meuArray.getElemento(i));
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
	 */
	@Test
	void testIndexOf1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20); // elemento testado
		meuArray.add(30);
		meuArray.add(40);

		/* Verificação */

		int index = 1; // index do elemento desejado

		assertEquals(index, meuArray.indexOf(20));
	}

	/**
	 * Teste de retorno do index do elemento que não se encontra na lista
	 * 
	 */
	@Test
	void testIndexOf2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20); // elemento testado
		meuArray.add(30);
		meuArray.add(40);

		/* Verificação */

		int index = -1; // index do elemento desejado

		assertEquals(index, meuArray.indexOf(100));
	}

	/**
	 * Teste de retorno do index da última aparição do elemento escolhido na lista
	 * 
	 */
	@Test
	void testLastIndexOf1() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20); // elemento buscado
		meuArray.add(30);
		meuArray.add(20); // ultimo do mesmo elemento buscado

		/* Verificação */

		int index = 3; // index do elemento desejado

		assertEquals(index, meuArray.lastIndexOf(20));
	}

	/**
	 * Teste de retorno do index do elemento que não se encontra na lista
	 */
	@Test
	void testLastIndexOf2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(20); // elemento buscado
		meuArray.add(30);
		meuArray.add(20); // ultimo do mesmo elemento buscado

		/* Verificação */

		int index = -1; // index do elemento desejado

		assertEquals(index, meuArray.lastIndexOf(100));
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

		assertEquals(30, meuArray.getElemento(index));
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

		assertEquals(elementoAtual, meuArray.getElemento(index));
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

		assertFalse(meuArray.isEmpty()); // nao deve estar vazia
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

		assertTrue(meuArray.isEmpty()); // deve estar vazia
	}

	/**
	 * Teste de cópia da lista
	 */
	@Test
	void testClone1() {

		/* Cenário */

		meuArray.add(10);

		/* Execução */

		Object[] copiaArray = (Object[]) meuArray.clone();

		/* Verificação */
		
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

		/* Cenário */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execução */

		Object[] copiaArray = (Object[]) meuArray.clone();

		/* Verificação */
		
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

		/* Cenário */

		int elementoNaLista = 10;
		meuArray.add(elementoNaLista);

		/* Verificação */

		int elementoBuscado = 10;
		assertTrue(meuArray.contains(elementoBuscado));
	}

	/**
	 * Teste de elemento buscado contido na lista, sendo falso
	 */
	@Test
	void testContains2() {

		/* Cenário */

		int elementoNaLista = 10;
		meuArray.add(elementoNaLista);

		/* Verificação */

		int elementoBuscado = 20;
		assertFalse(meuArray.contains(elementoBuscado));
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
		assertEquals(tamanhoArray, meuArray.size());
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
		assertEquals(tamanhoArray, meuArray.size());
	}

	/**
	 * Teste de quantidade de elementos na lista
	 */
	@Test
	void testSize1() {

		/* Execução */

		meuArray.add(10);

		/* Verificação */

		int tamanhoArray = 1;
		assertEquals(tamanhoArray, meuArray.size());
	}

	/**
	 * Teste a diminuição do tamanho da lista para o tamanho exato de elementos na
	 * mesma
	 * 
	 */
	@Test
	void testTrimToSize1() {

		/* Cenário */

		meuArray.add(10);

		/* Execução */

		meuArray.trimToSize();

		/* Verificação */

		int tamanhoArray = 1;
		assertEquals(tamanhoArray, meuArray.getCapacidadeLista());
	}

	/**
	 * Teste a diminuição do tamanho da lista, com multiplos elementos, para o
	 * tamanho exato de elementos na mesma
	 * 
	 */
	@Test
	void testTrimToSize2() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execução */

		meuArray.trimToSize();

		/* Verificação */

		int tamanhoArray = 4;
		assertEquals(tamanhoArray, meuArray.getCapacidadeLista());
	}

	/**
	 * Teste a diminuição do tamanho da lista, sem adicionar elementos, logo após
	 * adiciona e executa novamente o trim
	 * 
	 */
	@Test
	void testTrimToSize3() {

		/* Cenário */

		meuArray.trimToSize();
		assertEquals(0, meuArray.getCapacidadeLista());

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);
		meuArray.add(13);

		/* Execução */

		meuArray.trimToSize();

		/* Verificação */

		int tamanhoArray = 4;
		assertEquals(tamanhoArray, meuArray.getCapacidadeLista());
	}

	/**
	 * Teste a diminuição do tamanho da lista com a lista já com o tamanho igual ao
	 * numero de elementos
	 * 
	 */
	@Test
	void testTrimToSize4() {

		/* Cenário */

		meuArray.add(10);
		meuArray.add(11);
		meuArray.add(12);

		/* Execução */

		meuArray.trimToSize();

		/* Verificação */

		int tamanhoArray = 3;
		assertEquals(tamanhoArray, meuArray.getCapacidadeLista());
	}

}
