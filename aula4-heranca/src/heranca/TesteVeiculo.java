package heranca;

public class TesteVeiculo {

	public static void main(String[] args) {

		Moto v1 = new Moto("MTO909", "Vermelho", 39000., true);
		Caminhao v2 = new Caminhao("CMN9090", "Branco", 110000., 100000);

		System.out.println("\nValor IPVA: " + v1.calcularIpva());
		System.out.println(v1);
		
		System.out.println("\nValor IPVA: " + v2.calcularIpva());
		System.out.println(v2);
	}

}
