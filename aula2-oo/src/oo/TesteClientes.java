package oo;

public class TesteClientes {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.nome = "Maria";
		c.cpf = "12345678901";
		c.telefone = "999999999";

		System.out.println(c.nome);
	}

}
