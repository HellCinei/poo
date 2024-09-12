package relacao;

public class TesteImovel {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Haroldo", "carlinhos@gmail.com");
		Pessoa p2 = new Pessoa("Helcinei", "helcinei@gmail.com");

		Imovel i1 = new Imovel("Casa", 1180000., p2);
		Imovel i2 = new Imovel("Apt", 2000000., p1);

		System.out.println(i1);
		System.out.println(i2);
	}
}
