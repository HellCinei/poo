package teste;

public class Pai {
	protected String nome;
	protected Integer idade;

	
	public Pai(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\nnome: " + nome + "\nidade: " + idade;
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

}
