package revisao;

import java.time.LocalDate;

public class Cachorro extends Animal implements AnimalDomestico {
	private boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, boolean castrado) {
		super(nome, dataVacinacao);
		this.castrado = castrado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	@Override
	public boolean levareterinario() {
		return false;
	}

	@Override
	public boolean alimentar() {
		return false;
	}

	@Override
	public String emitirSom() {
		return null;
	}

}
