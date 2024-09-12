package interfaces;

public class TesteTributos {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Haroldo", 98000.);
		Empresa empresa = new Empresa("ABC Ltda", 288500.);
		TotalTributos t = new TotalTributos();
		t.totalizarTributos(empresa);
		t.totalizarTributos(pessoa);
		
		System.out.println("IR: " + pessoa.getNome() + " - " + pessoa.calcularIR());
		System.out.println("ICMS: " + pessoa.getNome() + " - " + pessoa.calcularICMS());

		System.out.println("\nIR: " + empresa.getRazaoSocial() + " - " + empresa.calcularIR());
		System.out.println("ICMS: " + empresa.getRazaoSocial() + " - " + empresa.calcularICMS());
		
		System.out.println("\nTotal Geral: " + t.getTotalGeral());
	}

}
