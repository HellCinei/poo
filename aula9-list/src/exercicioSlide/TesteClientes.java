package exercicioSlide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteClientes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		String telefone;
		Integer id = 1;
		Integer idade;

		List<Cliente> clientes = new ArrayList<>();

		do {
			try {
				System.out.println("Digite seu nome: ");
				nome = sc.next();

				System.out.println("Digite seu telefone: ");
				telefone = sc.next();

				System.out.println("Digite seu ID: ");
				id = sc.nextInt();

				System.out.println("Digite sua idade: ");
				idade = sc.nextInt();

				Cliente cliente = new Cliente(id, nome, idade, telefone);
				cliente.verificaId();

				clientes.add(cliente);

			} catch (ClienteException ce) {
				System.err.println(ce.getMessage());
			}
		} while (id > 0);
		sc.close();
		
		System.out.println("\nClientes registrados!");
		for (Cliente c: clientes) {
			System.out.println(c);
		}
	}

}
