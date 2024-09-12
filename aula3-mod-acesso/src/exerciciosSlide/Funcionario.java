package exerciciosSlide;

public class Funcionario {
	private String nome;
	private Double salario;

	// Construtos usado para receber os atributos do funcionário
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	// Calcula o valor do Inss (11% do salário bruto)
	public Double calcularInss() {
		return salario * 0.11;
	}

	// Calcula o valor do Vale transporte (6% do salário bruto)
	public Double calcularVT() {
		return salario * 0.06;
	}

	// Calcula o salário com os descontos
	public Double salarioLiquido() {
		return salario * 0.83;
	}

	// Usado para enviar o nome para o programa principal (InfoFuncionario)
	public String getNome() {
		return nome;
	}

	// Usado para enviar o salário para o programa principal (InfoFuncionario)
	public Double getSalario() {
		return salario;
	}

}
