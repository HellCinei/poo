package exercicioSlide;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected Double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return proprietario + "\nData: " + dataConserto.format(formater) + "\nModelo: " + modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getValorCobrado() {
		return valorCobrado;
	}
	public void setValorCobrado(Double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	public LocalDate getDataConserto() {
		return dataConserto;
	}
	public void setDataConserto(LocalDate dataConserto) {
		this.dataConserto = dataConserto;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
}
