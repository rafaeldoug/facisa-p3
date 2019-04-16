
import java.util.LinkedList;
import java.util.Queue;

import entidades.Gender;
import entidades.Pessoa;

public class TesteCollectionsLinkedList {

	public static void main(String[] args) {

		Queue<String> lista = new LinkedList<String>();

		lista.add("urubu");
		lista.add("pirulito");
		lista.add("chiclete");

		System.out.println(lista);
		System.out.println();

		lista.offer("capataz");

		System.out.println();
		System.out.println(lista);
		System.out.println();

		for (String item : lista) {

			System.out.println(item);

		}

		System.out.println();
		System.out.println("teste 1");
		System.out.println();

		LinkedList<Pessoa> pessoas = new LinkedList<Pessoa>();

		if (pessoas.isEmpty()) {
			System.out.println("Lista de pessoas vazia");
		} else {
			System.out.println(pessoas);
		}

		System.out.println();
		System.out.println("teste 2");
		System.out.println();

		pessoas.add(new Pessoa("Doug", "doug@email.com", 35, Gender.M));
		pessoas.add(new Pessoa("Gaby", "gaby@email.com", 31, Gender.F));
		pessoas.add(new Pessoa("Daniel", "daniel@email.com", 37, Gender.M));

		if (pessoas.isEmpty()) {
			System.out.println("Lista de pessoas vazia");
		} else {
			for (Pessoa pessoa : pessoas) {
				System.out.println("nome do meliante: " + pessoa.getNome() + " | " + "email: " + pessoa.getEmail());
			}
		}

		pessoas.add(new Pessoa("Gildo", "gildo@email.com", 37, Gender.M));

	}

}
