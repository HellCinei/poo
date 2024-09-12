package enumeradores;

public class Turma {
	private Integer numero;
	private PeriodoCurso periodoCurso;

	public Turma(Integer numero, PeriodoCurso periodoCurso) {
		super();
		this.numero = numero;
		this.periodoCurso = periodoCurso;
	}

	@Override
	public String toString() {
		return "Número: " + numero +
				"\nDias: " + periodoCurso.getDIAS() +
				"\nCarga Horária: " + periodoCurso.getCARGAHORARIA() + " horas" +
				"\nValor: " + periodoCurso.getVALOR();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public PeriodoCurso getPeriodoCurso() {
		return periodoCurso;
	}

	public void setPeriodoCurso(PeriodoCurso periodoCurso) {
		this.periodoCurso = periodoCurso;
	}

}