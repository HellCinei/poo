package banco;

public class Conta {
	public Integer num;
	public String titular;
	public Double saldo;

	public void deposito(Double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido!");
		} else {
			saldo += valor;
			System.out.println("Deposito efetuado!");
		}
	}

	public boolean saque(Double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
}
