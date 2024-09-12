package exercicioSlide;

public enum TipoServico {
	OLEO(100.), LAVAGEM(50.), REVISAO(200.);
	
	private double valorServico;

	private TipoServico(double valorServico) {
		this.valorServico = valorServico;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}
	
	
}
