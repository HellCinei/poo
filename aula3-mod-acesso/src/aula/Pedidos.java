package aula;

import java.time.LocalDate;

public class Pedidos {

	private Integer numero;
	private LocalDate data;
	private Double total;
	private static int cont;

	public Pedidos(Integer numero, LocalDate data, Double total) {
		this.numero = numero;
		this.data = data;
		this.total = total;
		cont++;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public static int getCont() {
		return cont;
	}
}
