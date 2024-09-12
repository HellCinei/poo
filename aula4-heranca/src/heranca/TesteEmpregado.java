package heranca;

public class TesteEmpregado {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();

		g1.setNome("Haroldo");
		g1.setCpf("12345678901");
		g1.setSalario(5000.);
		g1.setCategoria("ADM");
		g1.setNumeroEmpregados(10);
		
		g1.aumentoSalario();
		
		System.out.println(g1);
	}
}
