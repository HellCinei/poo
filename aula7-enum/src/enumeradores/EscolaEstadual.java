package enumeradores;

public class EscolaEstadual extends Escola {
	private final String SEGMENTO = "Médio";

	public EscolaEstadual(String cnpj, String razaoSocial) {
		super(cnpj, razaoSocial);
	}

	public String getSEGMENTO() {
		return SEGMENTO;
	}

}
