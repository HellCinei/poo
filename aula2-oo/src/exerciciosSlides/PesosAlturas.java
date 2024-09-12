package exerciciosSlides;

import java.util.Scanner;

public class PesosAlturas {
	
	public static void main(String[] args) {
		String[] nome = new String[4];
		Double[] altura = new Double[4];
		Double[] peso = new Double[4];
		Double maiorAltura = 0., maiorPeso = 0.;
		Double somaPeso = 0., somaAltura = 0.;
		int p = 0, a = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < nome.length; i++) {

			System.out.printf("Digite o %d° nome:", i + 1);
			nome[i] = sc.next();
			System.out.printf("Digite o %d° peso:", i + 1);
			peso[i] = sc.nextDouble();
			System.out.printf("Digite a %d° altura:", i + 1);
			altura[i] = sc.nextDouble();
			somaPeso += peso[i];
			somaAltura += altura[i];
			if (peso[i] > maiorPeso) {
				maiorPeso = peso[i];
				p = i;
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
				a = i;
			}

		}
		sc.close();
		System.out.printf("%s é o mais pesado!n", nome[p]);
		System.out.printf("%s é o mais alto!/n", nome[a]);
		System.out.printf("A média dos pesos é %.2f/n", somaPeso / peso.length);
		System.out.printf("A média das alturas é %.2f", somaAltura / altura.length);
	}
}