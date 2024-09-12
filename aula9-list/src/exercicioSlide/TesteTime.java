package exercicioSlide;

import java.util.ArrayList;
import java.util.List;

public class TesteTime {

	public static void main(String[] args) {
		Time t1 = new Time("Fla", "Jose", "Joao");
		Time t2 = new Time("Flu", "Ana", "Carla");
		
		Atleta a1 = new Atleta("Andre", 25, "atac", t1);
		Atleta a2 = new Atleta("Davi", 26, "gol", t1);
		Atleta a3 = new Atleta("Flavia", 20, "atac", t2);
		Atleta a4 = new Atleta("Nath", 24, "gol", t2);
		
		List<Atleta> lista = new ArrayList<>();
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		for (Atleta a : lista) {
			System.out.println(a);
		}
	}

}
