package exercicioSlide;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, Integer cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public Double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorServico();
	}

	@Override
	public Double trocarOleo() {
		return TipoServico.OLEO.getValorServico();
	}

	@Override
	public Double revisao() {
		return TipoServico.REVISAO.getValorServico();
	}

}
