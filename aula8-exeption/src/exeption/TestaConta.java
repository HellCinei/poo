package exeption;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("123-1", 2000.);
		
		try {
			cc.deposito(100.);
			cc.saque(200.);
			
			System.out.println(cc.toString());
			
		} catch (ContaException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

}
