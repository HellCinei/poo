package heranca;

public class Caminhao extends Veiculo {
	private Integer cargaMax;

	public Caminhao(String placa, String cor, Double preco, Integer cargaMax) {
		super(placa, cor, preco);
		this.cargaMax = cargaMax;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCarga Máxima: " + cargaMax;
	}

	public Integer getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(Integer cargaMax) {
		this.cargaMax = cargaMax;
	}

	@Override
	public Double calcularIpva() {
		return preco * 0.05 + 200;
	}

}
