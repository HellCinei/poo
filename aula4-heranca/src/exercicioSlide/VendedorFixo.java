package exercicioSlide;

public class VendedorFixo extends Vendedor {
	private Double salarioBase;
	private Double salarioBruto;
	private Double comissao;

	public VendedorFixo(String nome, String cpf, Double salarioBase, Double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto = salarioBase;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalário Base: " + salarioBase + "\nComissão: " + comissao + "\nSalário Bruto: "
				+ salarioBruto;
	}

	public void calcualarSalario(Double valorVenda) {
		salarioBruto += comissao * valorVenda;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBase;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

}
