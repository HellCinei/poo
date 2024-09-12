package exercicioSlide;

import java.util.Scanner;

public class Console {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Erro! Digite um número inteiro!!");
		}
	}
}
