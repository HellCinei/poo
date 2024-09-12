package revisao;

import java.time.LocalDate;

public class Venda {
	private Integer codigo;
	private LocalDate data;
	private Integer quantidade;
	private Double total;
	private Double valor;

	public Venda(Integer codigo, LocalDate data, Integer quantidade, Double total, Double valor) {
		this.codigo = codigo;
		this.data = data;
		this.quantidade = quantidade;
		this.total = total;
		this.valor = valor;
	}

	public void finalizarVenda() {

		if (data.getDayOfWeek().getValue() == 7) {
			total = valor * quantidade * 0.9;
		} else {
			total = valor * quantidade;
		}

	}

	public String toString() {
		return "Venda [codigo=" + codigo + ", data=" + data + ", quantidade=" + quantidade + ", total=" + total
				+ ", valor=" + valor + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
