/**
 * 
 */
package br.cesed.si.p3.array;

import java.util.Arrays;

/**
 * @author Rafael Nascimento
 * @see <a href=
 *      "https://github.com/rafaeldoug/facisa-p3/tree/master/MeuArrayList">Github</a>
 *
 */

public class MeuArrayList {

	private static final int TAMANHO_INICIAL = 3;

	private Object[] meuArray;
	private int elementos; // numero de elementos na lista
	private int capacidadeLista;

	public MeuArrayList() {
		this.meuArray = new Object[TAMANHO_INICIAL]; // lista vazia iniciada
		this.capacidadeLista = TAMANHO_INICIAL;
	}

	/**
	 * Adciona novo elemento apos ultimo da lista
	 * 
	 * @param object Elemento a ser adicionado na lista
	 */
	public void add(Object object) {

		this.limiteArray();

		if (elementos != 0 && object != null) {
			if (meuArray[0].getClass() != object.getClass()) {
				throw new IllegalArgumentException("Adicione apenas objetos do mesmo tipo");
			}
		}

		if (object != null) {
			meuArray[elementos] = object;
			elementos++;
		}
	}

	/**
	 * Adciona novo elemento na posicao indicada
	 * 
	 * @param index  Indica a posicao onde o elemento vai ser adicionado
	 * @param object Objeto a ser adicionado
	 */
	public void addIndex(int index, Object object) {

		if (index >= elementos) {
			throw new IndexOutOfBoundsException();
		} else if (index < 0) {
			throw new NumberFormatException();
		}

		this.limiteArray();

		if (elementos != 0) {
			if (meuArray[0].getClass() != object.getClass()) {
				throw new IllegalArgumentException("Adicione apenas objetos do mesmo tipo");
			}
		}

		for (int i = elementos; i > index; i--) {
			meuArray[i] = meuArray[i - 1];
		}

		if (object != null) {
			meuArray[index] = object;
			elementos++;
		}
	}

	/**
	 * Concatena outra lista no fim da lista atual
	 * 
	 * @param object Objeto lista a ser concatenado
	 */
	public void addAll(Object[] object) {

		this.limiteArray();

		if (elementos != 0) {
			if (meuArray[0].getClass() != object[0].getClass()) {
				throw new IllegalArgumentException("Adicione apenas objetos do mesmo tipo");
			}
		}

		int tamanhoAtual = elementos;
		for (int i = 0; i < object.length; i++) {
			this.limiteArray();
			meuArray[tamanhoAtual] = object[i];
			tamanhoAtual++;
			elementos++;
		}
	}

	/**
	 * Remove elementos da lista utilizando o index
	 * 
	 * @param index Indica a posicao do elemento a ser removido
	 */
	public void remove(int index) {

		if (index >= elementos) {
			throw new IndexOutOfBoundsException();
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
	 * Retorna o elementos da lista referente ao index desejado
	 * 
	 * @param index Indica a posicao do elemento a ser retornado
	 * @return Retorna o valor referente ao index indicado
	 */
	public Object getElemento(int index) {

		if (index >= elementos) {
			throw new IndexOutOfBoundsException();
		} else if (index < 0) {
			throw new NumberFormatException();
		}
		return meuArray[index];
	}

	/**
	 * Retorna o index do primeiro retorno na lista do elemento desejado
	 * 
	 * @param object Elemento que busca o index
	 * @return Retorna o index do elemento escolhido
	 */
	public int indexOf(Object object) {

		int index = -1;

		for (int i = 0; i < elementos; i++) {
			if (meuArray[i].equals(object)) {
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 * Retorna o index da ultimo retorno na lista do elemento desejado
	 * 
	 * @param object Elemento que busca o index
	 * @return Retorna o index do elemento escolhido
	 */
	public int lastIndexOf(Object object) {

		int index = -1;

		for (int i = 0; i < elementos; i++) {
			if (meuArray[i].equals(object)) {
				index = i;
			}
		}
		return index;
	}

	/**
	 * Altera o valor do elemento na lista
	 * 
	 * @param index  Indica a posicao do elemento a ser alterado
	 * @param objeto Novo valor do elemento
	 */
	public void setElemento(int index, Object objeto) {

		if (index >= elementos) {
			throw new IndexOutOfBoundsException();
		} else if (index < 0) {
			throw new NumberFormatException();
		}

		if (objeto != null) {
			meuArray[index] = objeto;
		}
	}

	/**
	 * Retorna true se a lista esta vazia e false se lista possua qualquer elemento
	 * 
	 * @return
	 */
	public boolean isEmpty() {

		return elementos == 0;
	}

	/**
	 * @param objeto
	 * @return
	 */
	public boolean contains(Object objeto) {

		boolean contains = false;
		for (int i = 0; i < elementos; i++) {
			if (meuArray[i].equals(objeto)) {
				contains = true;
				break;
			}
		}
		return contains;
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
	 * Diminui a capacidade da lista para a quantidade exata de elementos
	 * 
	 */
	public void trimToSize() {

		if (elementos != capacidadeLista) {
			Object[] novoArray = new Object[elementos];
			for (int i = 0; i < elementos; i++) {
				novoArray[i] = meuArray[i];
			}
			capacidadeLista = elementos;
			meuArray = novoArray;
		}
	}

	/**
	 * Limpa a lista atual
	 */
	public void clear() {
		// apaga a lista atual criando uma nova com o tamanho inicial
		meuArray = new Object[TAMANHO_INICIAL];
		this.elementos = 0;
	}

	/**
	 * Verifica tamanho do array e aumenta seu tamanho, se necessário
	 */
	private void limiteArray() {

		if (elementos == meuArray.length) {
			Object[] novoArray = new Object[meuArray.length + TAMANHO_INICIAL];
			for (int i = 0; i < elementos; i++) {
				novoArray[i] = meuArray[i];
			}
			capacidadeLista += TAMANHO_INICIAL;
			meuArray = novoArray;
		}

	}

	/**
	 * @return Retorna a capacidade da lista
	 */
	public int getCapacidadeLista() {
		return capacidadeLista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + elementos;
		result = prime * result + Arrays.deepHashCode(meuArray);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeuArrayList other = (MeuArrayList) obj;
		if (elementos != other.elementos)
			return false;
		if (!Arrays.deepEquals(meuArray, other.meuArray))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MeuArrayList: \n" + "[meuArray = " + Arrays.toString(meuArray) + ",\n" + "qtd. de elementos = "
				+ elementos + "]";
	}

}
