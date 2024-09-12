package exerciciosSlides;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome, telefone, email;
		Double salario;

		System.out.println("Digite seu nome: ");
		nome = sc.next();

		System.out.println("Digite seu telefone: ");
		telefone = sc.next();

		System.out.println("Digite seu email: ");
		email = sc.next();

		System.out.println("Digite seu salario: ");
		salario = sc.nextDouble();

		sc.close();

		System.out.printf("Nome: %s\nTelefone: %s\nE-mail: %s\nSalario com acrécimo: R$ %.2f", nome, telefone, email,
				salario * 1.1);
	}

}
