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

		this.limiteArray(); // verifica o limite do array

		this.tipoObjetos(object); // verifica o tipo dos elementos ja contidos no array

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

		this.verificaIndex(index); // verifica se o index eh valido

		this.limiteArray(); // verifica o limite do array

		this.tipoObjetos(object); // verifica o tipo dos elementos ja contidos no array

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

		this.limiteArray(); // verifica o limite do array

		// verifica os tipos dos primeiros elementos do array de destino e do array a ser adicionado
		if (elementos != 0 && object != null) {
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

		this.verificaIndex(index); // verifica se o index eh valido

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

		this.verificaIndex(index); // verifica se o index eh valido
		
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

		this.verificaIndex(index); // verifica se o index eh valido

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
	 * Retorna uma copia da lista original
	 * 
	 * @return Os elementos da lista copiada
	 */
	public Object clone() {

		Object[] copiaArray = new Object[meuArray.length];
		for (int i = 0; i < elementos; i++) {
			copiaArray[i] = meuArray[i];
		}
		return copiaArray;
	}

	/**
	 * Retorna true se o elemento buscado se encontrar na lista
	 * 
	 * @param objeto Elemento a ser buscado na lista
	 * @return True se contem e False se n�o contem
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

		meuArray = new Object[TAMANHO_INICIAL]; // apaga a lista atual criando uma nova com o tamanho inicial
		this.elementos = 0;
	}

	/**
	 * Retorna a capacidade da lista
	 * 
	 * @return 
	 */
	public int getCapacidadeLista() {
		return capacidadeLista;
	}

	/**
	 * Verifica tamanho do array e aumenta seu tamanho, se necess�rio
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
	 * Verifica a compatibilidade do tipo dos objetos antes de adicionar ao array
	 * 
	 * @param object - Objeto a ser verificado
	 */
	private void tipoObjetos(Object object) {

		if (elementos != 0 && object != null) {
			if (meuArray[0].getClass() != object.getClass()) {
				throw new IllegalArgumentException("Adicione apenas objetos do mesmo tipo");
			}
		}
	}
	
	/**
	 * Verifica se o index indicado eh valido
	 * 
	 * @param index - Index a ser verificado
	 */
	private void verificaIndex(int index) {
		
		if (index >= elementos) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (index < 0) {
			throw new NumberFormatException();
		}
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
