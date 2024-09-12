package exercicioSlide;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {

		char opcao;
		Double valorVenda, totalVendas = 0.;
		
		Scanner sc = new Scanner(System.in);
		
		VendedorFixo f1 = new VendedorFixo ("Haroldo", "12345678901", 2000., 0.03);
		VendedorFixo f2 = new VendedorFixo ("Gabriel", "98765432109", 2000., 0.03);
		
		do {
			System.out.println("Escolha um vendedor:\n1- " + f1.getNome() + "\n2- " + f2.getNome());
			opcao = sc.next().charAt(0);
			
			switch (opcao) {
			case '1':
				System.out.println("Digite o valor da venda: ");
				valorVenda = sc.nextDouble();
				totalVendas += valorVenda;
				f1.calcualarSalario(valorVenda);
				break;

			case '2':
				System.out.println("Digite o valor da venda: ");
				valorVenda = sc.nextDouble();
				totalVendas += valorVenda;
				f2.calcualarSalario(valorVenda);
				break;
				
			default:
				
				break;
			}
			
			System.out.println(opcao == '1' || opcao == '2' ? "Deseja encerrar o programa? \n     S\t\tN" : "Opção inválida!");
			opcao = (opcao == '1' || opcao == '2' ? sc.next().charAt(0) : 'N');
			opcao = Character.toUpperCase(opcao);
			
		}while(opcao != 'S');
		sc.close();
		
		System.out.println("--==+==--Salário dos vendedores--==+==--" +
				"\n" + f1 +
				"\n" + f2 +
				"\n--==+==--Total Vendido--==+==--" + "\nTotal: " + totalVendas);
	}

}
