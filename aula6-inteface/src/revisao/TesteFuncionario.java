package revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		Assistente a = new Assistente("Haroldo", 2200., "Noite", "1");
		Diretor d = new Diretor("Helcinei", 8500., "Integral", "Financeiro");
		
		a.reajusteSalario();
		d.reajusteSalario();
		
		System.out.println(a);
		System.out.println("\n" + d);
	}

}
