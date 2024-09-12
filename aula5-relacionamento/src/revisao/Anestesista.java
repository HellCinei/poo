package revisao;

public class Anestesista extends Medico {
	private String tipoAnestesista;

	public Anestesista(String nome, String nomeMedico, String crm, String tipoAnestesista) {
		super(nome, nomeMedico, crm);
		this.tipoAnestesista = tipoAnestesista;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAnestesista: " + tipoAnestesista;
	}

	public String getTipoAnestesista() {
		return tipoAnestesista;
	}

	public void setTipoAnestesista(String tipoAnestesista) {
		this.tipoAnestesista = tipoAnestesista;
	}

	@Override
	public Double calcualrPagamento() {
		return valorPago = super.calcualrPagamento() + 2000.;
	}
}
