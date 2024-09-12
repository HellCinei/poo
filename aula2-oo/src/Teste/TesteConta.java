package Teste;

import banco.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.num = 123;
		conta1.titular = "Helcinei";
		conta1.saldo = 1000.00;

		conta1.deposito(500.00);

		if (conta1.saque(200.00)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}

		System.out.println("Seu saldo é " + conta1.saldo);
	}

}
