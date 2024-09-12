package exercicioSlide;

public class Atleta {
	private String nome;
	private Integer idade;
	private String posicao;
	private Time time;

	public Atleta(String nome, Integer idade, String posicao, Time time) {
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
		this.time = time;
	}

	@Override
	public String toString() {
		return "\nnome: " + nome + "\nidade: " + idade + "\nposicao: " + posicao + time;
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

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
