package aula;

public class TesteGenerics {

	public static void main(String[] args) {
		ExemploGenerics<String> egs = new ExemploGenerics<String>("Oi!");
		ExemploGenerics<Double> egd = new ExemploGenerics<Double>(1000.);
		
		System.out.println(egs);
		System.out.println(egd);
	}

}
