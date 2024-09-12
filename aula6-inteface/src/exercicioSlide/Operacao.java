package exercicioSlide;

public class Operacao implements Livraria {
	private String tipo;
	private Double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Livro livro) {
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + "\nValor: " + String.format("%.2f", valorOperacao) + livro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(Double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public void emprestalLivro() {
		valorOperacao = livro.getValor() * 0.02 + TAXAEMPRESTIMO;
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() * 1.09;
	}

}
