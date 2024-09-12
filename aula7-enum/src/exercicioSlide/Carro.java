package exercicioSlide;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCategoria: " + categoria + "\nValor: " + valorCobrado;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public Double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorServico();
	}

	@Override
	public Double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			return TipoServico.OLEO.getValorServico() - 50.;
		} else {
			return TipoServico.OLEO.getValorServico();
		}
	}

	@Override
	public Double revisao() {
		if (dataConserto.getMonthValue() == 8) {
			return TipoServico.REVISAO.getValorServico() * 0.90;
		} else {
			return TipoServico.REVISAO.getValorServico();
		}
	}


}
