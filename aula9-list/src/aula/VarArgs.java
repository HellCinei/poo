package aula;

public class VarArgs {

	public static void main(String[] args) {
		int total = 0;
		total = calcularSoma(100, 10, 20, 30);
		System.out.println("Total: " + total);
	}

	public static int calcularSoma(int num, int... numeros) {
		int soma = 0;

		for (int i : numeros) {
			soma += i;
		}
		return soma * num;
	}
}
