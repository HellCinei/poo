package aula;

import java.util.LinkedHashMap;

public class exercicioMap {
	public static void main(String[] args) {
		
	//HashMap<Integer, String> mapas = new HashMap<>();
	//TreeMap<Integer, String> mapas = new TreeMap<>();
	LinkedHashMap<Integer, String> mapas = new LinkedHashMap<>();
		
	mapas.put(100, "Ana");
	mapas.put(23, "Carlos");
	mapas.put(13, "Igor");
	mapas.put(44, "Adriana");
	
	System.out.println(mapas);
	}
}
