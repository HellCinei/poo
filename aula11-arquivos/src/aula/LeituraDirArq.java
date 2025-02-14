package aula;

import java.io.File;
import java.util.Scanner;

public class LeituraDirArq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome de um arquivo ou diretório:\n");
		String nome = sc.nextLine();

		File arquivo = new File(nome);

		if (arquivo.exists()) {
			if (arquivo.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bites\n", arquivo.getName(), arquivo.length());
			} else {
				System.out.println("\nConteúdo da pasta\n");
				for (File file : arquivo.listFiles()) {
					System.out.println(file);
				}
			}

		} else {
			System.err.println("Arquivo ou diretório não encontrado!");
		}
	}
}
