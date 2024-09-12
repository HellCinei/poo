package aula;

public class Pessoa {
	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;

	private double calculoImc() {
		return peso / (altura * altura);
	}

	public String resposta() {
		if (calculoImc() < 18.5) {
			return "Abaixo do peso";
		}
		else if (calculoImc() <= 24.9) {
			return "Peso normal";
		}
		else {
			return "Acima do peso";
		}
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAltura() {
		return altura;
	}
}
