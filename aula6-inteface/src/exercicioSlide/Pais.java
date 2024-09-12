package exercicioSlide;

public class Pais {
	private String nomePais;

	public Pais(String nomePais) {
		this.nomePais = nomePais;
	}
	
	@Override
	public String toString() {
		return "País: " + nomePais;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

}
