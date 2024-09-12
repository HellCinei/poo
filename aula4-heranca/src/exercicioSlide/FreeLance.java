package exercicioSlide;

public class FreeLance extends Vendedor {

	private Integer diasTrabalhados;
	private Double valorDia;

	public FreeLance(String nome, String cpf, Integer diasTrabalhados, Double valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDias Trabalhados: " + diasTrabalhados + "\nValor do dia: " + valorDia;
	}

	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(Integer diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}
	
}
