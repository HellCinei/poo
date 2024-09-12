package exeption;

public class ContaCorrente implements Conta {
	private String numeroConta;
	private Double saldo;

	public ContaCorrente(String numeroConta, Double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "\nnumeroConta: " + numeroConta + "\nsaldo: " + saldo;
	}


	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public boolean saque(double valor) {
		if (saldo < valor) {
			throw new ContaException("Salado insuficiente!");
		}
		saldo -= valor;
		return true;
	}

	@Override
	public void deposito(double valor) {
		if (valor <= 0) {
			throw new ContaException("Depósito não efetuado!");
		}
		saldo += valor;
	}
}
