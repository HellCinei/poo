package exerciciosSlides;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer numero;

		System.out.println("Digite um número:");
		numero = sc.nextInt();
		sc.close();

		for (int i = 1; i <= numero; i++) {
			System.out.printf("O fatorial de %d é: ", i);
			Integer fatorial = 1;
			for (int j = 1; j <= i; j++) {
				fatorial *= j;
			}
			System.out.println(fatorial);
		}
	}

}
