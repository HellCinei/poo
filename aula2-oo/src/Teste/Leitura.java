package Teste;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = sc.next();
		System.out.println("Boa noite " + nome);

		System.out.println("Digite sua idade:");
		Integer idade = sc.nextInt();

		System.out.println("Digite seu salário:");
		Double salario = sc.nextDouble();

		System.out.printf("%s tem %d anos e recebe %.2f", nome, idade, salario);
		sc.close();

	}

}
