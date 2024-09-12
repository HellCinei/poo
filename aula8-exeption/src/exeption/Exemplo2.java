package exeption;

public class Exemplo2 {
	
	public static void main(String[] args) {
		int vetor[] = {5,10,20};
		
		int i = 10, j = 0, resultado = 0;
		String texto = null;
		
		try {
			resultado = i/j;
			System.out.println(vetor[3]);
			System.out.println(texto.toUpperCase());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro de índex fora de faixa!");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("Erro de divisão por zero!");
		}catch (NullPointerException e) {
			System.err.println("Valor de texto nulo!");
		}
	}

}
