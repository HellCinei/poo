package exercicio;

//Criar um classe chamada Marca com os atributos codigo e nome
//Criar uma classe de Teste com o main e adicionar três marca em uma lista e imprimir a lista

public class Marca {
	private String nome;
	private Integer codigo;

	public Marca(Integer codigo, String nome) {
		this.nome = nome;
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "\nnome: " + nome + "\ncodigo: " + codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
