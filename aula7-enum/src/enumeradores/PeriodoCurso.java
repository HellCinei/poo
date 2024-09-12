package enumeradores;

public enum PeriodoCurso {
	NOTURNO("ter e qua", 2500., 40),
	INTEGRAL("seg e sex", 1800., 20),
	TARDE("qui e sex", 3200., 80);

	private final String DIAS;
	private final Double VALOR;
	private final Integer CARGAHORARIA;

	private PeriodoCurso(String DIAS, Double VALOR, Integer CARGAHORARIA) {
		this.DIAS = DIAS;
		this.VALOR = VALOR;
		this.CARGAHORARIA = CARGAHORARIA;
	}

	public String getDIAS() {
		return DIAS;
	}

	public Double getVALOR() {
		return VALOR;
	}

	public Integer getCARGAHORARIA() {
		return CARGAHORARIA;
	}

}
