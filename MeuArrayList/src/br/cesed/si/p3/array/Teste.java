package br.cesed.si.p3.array;

public class Teste {

	public static void main(String[] args) {

		MeuArrayList array = new MeuArrayList();

		array.add("oi");
		array.add("ai");
		array.add("ei");
		array.add("opi");
		array.add("oia");

		System.out.println("add: \n" + array);

		array.setElementoIndex(2, "copo");
		array.setElementoIndex(3, 2);
		array.add("prato");
		array.add("quebrando");

		System.out.println();

		System.out.println("set + add: \n" + array);

		int index = 6;

		try {
		array.remove(index);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("remove: \n" + array);
		
		System.out.println();
		System.out.println("getElementos:");
		System.out.println(array.getElementoIndex(2));
		System.out.println(array.getElementoIndex(3));
		
		array.clear();
		
		System.out.println();
		System.out.println("clear: \n" + array);
		
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("d");
		array.add("e");
		array.add("1");
		array.add("2");
		array.add("3");
				
		System.out.println();
		System.out.println("add normal: \n" + array);
		
		try {
		array.addIndex(-1, "z");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("add com index: \n" + array);
		

	}
}
