package enumeradores;

public class TestePessoa {
	public static void main(String[] args) {

		Pessoa p = new Pessoa("Haroldo", EstadoCivil.SOLTEIRO);
		p.setEstadoCivil(EstadoCivil.CASADO);
		
		System.out.println(p.getNome() + " - " + p.getEstadoCivil());
		
		System.out.println("----------------");
		
		for (EstadoCivil ec : EstadoCivil.values()) {
			System.out.println(ec);
		}
	}

}
