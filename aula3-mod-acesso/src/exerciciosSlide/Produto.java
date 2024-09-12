package exerciciosSlide;

public class Produto {
	private String nome;
	private Double valor, quantidade;

	public Double calcularImc() {
		return (this.valor * this.quantidade) * 0.12;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		return valor * quantidade;
	}

}
