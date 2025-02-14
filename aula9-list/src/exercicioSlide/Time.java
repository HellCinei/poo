package exercicioSlide;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;

	public Time(String nomeTime, String tecnico, String diretor) {
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
	}

	@Override
	public String toString() {
		return "\nnomeTime: " + nomeTime + "\ntecnico: " + tecnico + "\ndiretor: " + diretor;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

}
