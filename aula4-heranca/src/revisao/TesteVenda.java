package revisao;

import java.time.LocalDate;

public class TesteVenda {
	public static void main(String[] args) {
		
		Venda v1 = new Venda(25, LocalDate.of(2024, 9, 01), 2, 0., 50.);
		Venda v2 = new Venda(25, LocalDate.now(), 5, 0., 21.8);

		v1.finalizarVenda();
		v2.finalizarVenda();

		System.out.println(v1);
		System.out.println(v2);
	}
}
