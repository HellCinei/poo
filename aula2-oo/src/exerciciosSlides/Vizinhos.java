package exerciciosSlides;

import java.util.Scanner;

public class Vizinhos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		sc.close();

		System.out.printf("%d - %d - %d", numero - 1, numero, numero + 1);
	}

}
