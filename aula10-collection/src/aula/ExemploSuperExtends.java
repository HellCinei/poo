package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@SuppressWarnings("unused")
public class ExemploSuperExtends {

	public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(10, 20, 30, 40, 50);
		List<String> listaStrings = Arrays.asList("Samsung", "Apple", "LG");
		List<Object> listaObjetos = new ArrayList<Object>();
		
		copiarListas(listaNumeros, listaObjetos);
		
		imprimirListas(listaObjetos);
		//imprimirListas(listaNumeros);
		//imprimirListas(listaStrings);
	}

	public static void imprimirListas(List<?> lista) {
		for (Object o : lista) {
			System.out.println(o);
		}
	}
	
	public static void copiarListas(List<? extends Number>origem, List<? super Number>destino) {

		for (Number n : origem) {
			destino.add(n);
		}
		
	}
}