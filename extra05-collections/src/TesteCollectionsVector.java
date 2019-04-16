import java.util.Iterator;
import java.util.Vector;

import entidades.Gender;
import entidades.Pessoa;

public class TesteCollectionsVector {

	public static void main(String[] args) {

		Vector<String> lista = new Vector<String>();

		lista.add("urubu");
		lista.add("pirulito");
		lista.add("chiclete");

		System.out.println(lista);

		for (String item : lista) {

			System.out.println(item);

		}

		System.out.println();
		System.out.println("teste 1");
		System.out.println();

		Vector<Pessoa> pessoas = new Vector<Pessoa>();

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
				if (pessoa.getNome().charAt(0) >= 'G') {
					System.out.println("nome do meliante: " + pessoa.getNome() + " | " + "email: " + pessoa.getEmail());
				}
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Iterator:");
		System.out.println();

		Iterator<Pessoa> i = pessoas.iterator();
		while (i.hasNext()) {
			System.out.println("Nome da pessoinha: " + i.next().getNome());
		}

		System.out.println("--------------------------------------");
		System.out.println("tamanho da lista: " + pessoas.size());
		System.out.println();
		System.out.println(pessoas.get(2).getNome());

	}

}
