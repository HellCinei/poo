package exercicioSlide;

public class ArquivoBinario {
	private String nome;
	private Integer idade;
	private Double altura;

	@Override
	public String toString() {
		return nome + "\n" + idade + "\n" + altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
