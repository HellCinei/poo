package exeption;

public class Exemplo {

	public static double calcular(int a, int b) throws ArithmeticException {
		/*
		 * if (b == 0) { throw new ArithmeticException("Erro de divaisão por Zero!"); }
		 */
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Resultado: " + calcular(10, 0));
		} catch (ArithmeticException ae) {
			System.out.println("Erro de divião por Zero!");
		}finally {
			System.out.println("Sempre é executado!");
		}
	}
}
