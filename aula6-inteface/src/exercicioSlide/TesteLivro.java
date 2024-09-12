package exercicioSlide;

public class TesteLivro {
	public static void main(String[] args) {
		Livro l1 = new Livro("Marco Antônio", "Cisco CCNA", 85.);
		Livro l2 = new Livro("Kathy Sierra", "Use a cabeca Java", 98.);
		
		Operacao o1 = new Operacao("Venda", l1);
		Operacao o2 = new Operacao("Empréstimo", l2);
		
		l1.reajuste(1.06);
		
		o1.venderLivro();
		o2.emprestalLivro();
		
		System.out.println(o1);
		System.out.println("\n" + o2);
	}
}
