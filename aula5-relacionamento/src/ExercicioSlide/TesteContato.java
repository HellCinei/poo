package ExercicioSlide;

import java.util.Arrays;
import java.util.List;

public class TesteContato {

	public static void main(String[] args) {
		
		Estado es1 = new Estado("Rio", "RJ");
		Cidade ci1 = new Cidade("Petrópolis", es1);
		Endereco en1 = new Endereco("Rua Marechal Deodoro 219", "Centro", "25620150", ci1);
		List<Telefone> telefones = Arrays.asList(new Telefone("9999-9999"), new Telefone("8888-8888"));
		Contato c1 = new Contato("Helcinei");
		
		c1.adicionarTelefone(telefones);
		c1.setEndereco(en1);
		
		System.out.println(c1);
	}

}
