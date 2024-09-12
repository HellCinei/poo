package exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Criar um classe chamada Marca com os atributos codigo e nome
//Criar uma classe de Teste com o main e adicionar três marca em uma lista e imprimir a lista

public class TesteMarca {
	public static void main(String[] args) {
		
		
		List<Marca> marcas = new ArrayList<>();
		List<Marca> marcas2 = Arrays.asList(new Marca (4, "Chevrolet"),
											new Marca (5, "Honda"));
		marcas.addAll(marcas2);
		
		marcas.add(new Marca(1, "VolksWagen"));
		marcas.add(new Marca(2, "Fiat"));
		marcas.add(new Marca(3, "Nissan"));

		System.out.println(marcas);
	}
}
