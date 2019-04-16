import java.util.ArrayList;

import entidades.Gender;
import entidades.Pessoa;

public class TesteCollectionsArrayList {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>(5);

		lista.add("urubu");
		lista.add("pirulito");
		lista.add("chiclete");
		lista.add("urubbay");
		lista.add("piru");
		lista.add("chic");

		System.out.println(lista);
		lista.trimToSize();
		System.out.println("tamanho da lista: " + lista.size());
		lista.add("mais ota coisa");
		System.out.println("tamanho da lista: " + lista.size());

		for (String item : lista) {

			System.out.println(item);

		}

		System.out.println();
		System.out.println("teste 1");
		System.out.println();

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

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

		System.out.println();
		System.out.println("teste 3");
		System.out.println();

		pessoas.add(2, new Pessoa("Lucia", "lucia@email.com", 66, Gender.F));

		if (pessoas.isEmpty()) {
			System.out.println("Lista de pessoas vazia");
		} else {
			for (Pessoa pessoa : pessoas) {
				System.out.println("nome do meliante: " + pessoa.getNome() + " | " + "email: " + pessoa.getEmail());
			}
		}

		System.out.println();
		System.out.println("tamanho da lista: " + pessoas.size());
	}

}
