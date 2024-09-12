package relacao;

public class TesteTime {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta("Haroldo", 21);
		Atleta a2 = new Atleta("Helcinei", 24);
		Atleta a3 = new Atleta("Rodrigo", 20);
		
		Time t1 = new Time("Brasil", new Atleta[3]);
		
		t1.adicionarAtletas(a1);
		t1.adicionarAtletas(a2);
		t1.adicionarAtletas(a3);
		
		t1.mostrarTime();
	}

}
