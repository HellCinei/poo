package exercicioSlide;

public class Atletas implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	private static Integer totalParticipantes = 0;
	private Pais pais;

	public Atletas(String nome, Double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		verificaSituacao();
	}

	@Override
	public String toString() {
		return "\nAtleta: " + nome + "\n" + pais + modalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Integer getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public void verificaSituacao() {
		if (peso >= 90.) {
			totalParticipantes++;
			modalidade = "\nPoderá participar como: Peso pesado";
		} else if (peso < 90. && peso >= 60.) {
			totalParticipantes++;
			modalidade = "\nPoderá participar como: ";
		} else {
			modalidade = "\nNáo poderá participar da olimpiada";
		}
	}

}
