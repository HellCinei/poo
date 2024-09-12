package aula;

import java.time.LocalDate;

public class TestePedidos {
	public static void main(String[] args) {

		Pedidos pedidos = new Pedidos(123, LocalDate.now(), 100.);
		
		System.out.println(pedidos.getNumero());
		System.out.println(pedidos.getTotal());
		System.out.println("Valor total de pedidos: " + Pedidos.getCont());
	}
}
