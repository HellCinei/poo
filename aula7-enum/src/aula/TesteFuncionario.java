package aula;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Haroldo", aula.Funcionario.EstadoCivil.CASADO);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getEstadoCivil().getValor());
	}

}
