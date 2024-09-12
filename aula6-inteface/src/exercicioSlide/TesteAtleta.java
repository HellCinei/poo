package exercicioSlide;

public class TesteAtleta {

	public static void main(String[] args) {

		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("EUA");

		Atletas a1 = new Atletas("Anderson Silva", 98., p1);
		Atletas a2 = new Atletas("Jon Jone", 59., p2);
		Atletas a3 = new Atletas("Vitor Belfort", 110., p1);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println("\nTotal de participantes: \n" + a1.getTotalParticipantes());
	}

}
