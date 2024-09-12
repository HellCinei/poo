package exercicioSlide;

import java.time.LocalDate;

public class TesteOficina {
	public static void main(String[] args) {
		
		Proprietario p1 = new Proprietario("Haroldo");
		Carro c1 = new Carro("Porsche", LocalDate.of(2024, 8, 10), p1, "Carro");
		
		c1.setValorCobrado(c1.trocarOleo() + c1.revisao());

		System.out.println(c1);
	}
}
