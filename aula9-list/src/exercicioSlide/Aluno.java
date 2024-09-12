package exercicioSlide;

public class Aluno {
	private String nome;
	private Double nota1;
	private Double nota2;

	public Aluno(String nome, Double nota1, Double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "\nnome: " + nome + "\nnota1: " + nota1 + "\nnota2: " + nota2 + "\nMédia: " + calcularMedia();
	}

	public String getNome() {
		return nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public Double calcularMedia() {
		if (nota1 > 10 || nota1 < 0 || nota2 > 10 || nota2 <0) {
			throw new AlunoException("Nota inválida");
		} else {
			return (nota1 + nota2) / 2;
		}
	}
}
