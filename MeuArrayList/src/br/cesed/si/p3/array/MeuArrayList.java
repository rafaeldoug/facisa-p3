/**
 * 
 */
package br.cesed.si.p3.array;

import java.util.Arrays;

/**
 * @author Rafael Nascimento
 *
 */

/**
 * @author rafae
 *
 */
public class MeuArrayList {

	private static final int TAMANHO_INICIAL = 3;

	private Object[] meuArray;
	private int elementos; // numero de elementos na lista

	public MeuArrayList() {
		this.meuArray = new Object[TAMANHO_INICIAL]; // lista vazia iniciada
	}

	/**
	 * Adciona novo elemento após último da lista
	 * 
	 * @param object Elemento a ser adicionado à lista
	 */
	public void add(Object object) {

		if (elementos == meuArray.length) {
			Object[] novoArray = new Object[meuArray.length + TAMANHO_INICIAL];
			for (int i = 0; i < elementos; i++) {
				novoArray[i] = meuArray[i];
			}
			meuArray = novoArray;
		}

		meuArray[elementos] = object;
		elementos++;
	}

	/**
	 * Adciona novo elemento na posição indicada
	 * 
	 * @param index  Indica a posição onde o elemento vai ser adicionado
	 * @param object Objeto a ser adicionado
	 */
	public void addIndex(int index, Object object) {

		if (index >= elementos) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (index < 0) {
			throw new NumberFormatException();
		}

		if (elementos == meuArray.length) {
			Object[] novoArray = new Object[meuArray.length + TAMANHO_INICIAL];
			for (int i = 0; i < elementos; i++) {
				novoArray[i] = meuArray[i];
			}
			meuArray = novoArray;
		}

		for (int i = meuArray.length - 1; i > index; i--) {
			meuArray[i] = meuArray[i - 1];
		}

		meuArray[index] = object;
		elementos++;
	}

	/**
	 * Remove elementos da lista utilizando o index
	 * 
	 * @param index Indica a posição do elemento a ser removido
	 */
	public void remove(int index) {

		if (index >= elementos) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (index < 0) {
			throw new NumberFormatException();
		}

		int prox_elemento = index + 1;

		for (int i = index; i < elementos; i++) {
			meuArray[i] = meuArray[prox_elemento];
			prox_elemento++;
		}
		elementos--;

	}

	/**
	 * Retorna o elementos da lista referente ao index
	 * 
	 * @param index Indica a posição do elemento a ser retornado
	 * @return Retorna o valor referente ao index indicado
	 */
	public Object getElementoIndex(int index) {

		if (index >= elementos) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (index < 0) {
			throw new NumberFormatException();
		}
		return meuArray[index];
	}

	/**
	 * Altera o valor do elemento na lista
	 * 
	 * @param index  Indica a posição do elemento a ser alterado
	 * @param objeto Novo valor do elemento
	 */
	public void setElementoIndex(int index, Object objeto) {

		if (index >= elementos) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (index < 0) {
			throw new NumberFormatException();
		}
		meuArray[index] = objeto;
	}

	/**
	 * Retorna a quantidade de elementos na lista
	 * 
	 * @return Retorna quantidade de elementos na lista
	 */
	public int size() {
		return elementos;
	}

	/**
	 * Limpa a lista atual
	 */
	public void clear() {

		// apaga a lista atual criando uma nova com o tamanho inicial
		meuArray = new Object[TAMANHO_INICIAL];
		this.elementos = 0;
	}

	@Override
	public String toString() {
		return "MeuArrayList [meuArray=" + Arrays.toString(meuArray) + ", elementos=" + elementos + "]";
	}

}
