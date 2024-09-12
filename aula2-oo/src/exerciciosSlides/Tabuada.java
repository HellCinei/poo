package exerciciosSlides;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		System.out.println("Digite um número");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		System.out.println("---Tabuada---");

		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + i * num);
		}
	}

}
