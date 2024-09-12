package exercicioSlide;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TesteBinario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArquivoBinario ab = new ArquivoBinario();

		System.out.println("Nome: ");
		ab.setNome(sc.next());
		System.out.println("Idade: ");
		ab.setIdade(sc.nextInt());
		System.out.println("Altura: ");
		ab.setAltura(sc.nextDouble());
		sc.close();

		try {
			FileOutputStream arq = new FileOutputStream("arquivoBinario.txt");
			DataOutputStream grv = new DataOutputStream(arq);
			grv.writeChars(ab.toString());
			grv.close();
		} catch (IOException e) {
			System.out.println("Erro ao acessar o arquivo 1!");
		}

		System.out.println();

	}
}
