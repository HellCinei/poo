package teste;

public class Filho extends Pai{
	private String genero;
	private String signo;

	
	public Filho(String nome, Integer idade, String genero, String signo) {
		super(nome, idade);
		this.genero = genero;
		this.signo = signo;
	}

	@Override
	public String toString() {
		return super.toString() + "\ngenero: " + genero + "\nsigno: " + signo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
