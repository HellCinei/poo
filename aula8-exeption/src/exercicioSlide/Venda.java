package exercicioSlide;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
	private Integer quantidade;
	private LocalDate data;
	private Produto produto;
	private final Double totalVenda;

	public Venda(Integer quantidade, LocalDate data, Produto produto, Double totalVenda) {
		this.quantidade = quantidade;
		this.data = data;
		this.produto = produto;
		this.totalVenda = totalVenda;
		calcularVenda();
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public String toString() {
		return "\nquantidade: " + quantidade + "\ndata: " + data + "\nproduto: " + produto + "\ntotalVenda: "
				+ totalVenda;
	}

	@Override
	public void calcularVenda() {
		totalVenda += produto.getValor() * quantidade;
	}
}
