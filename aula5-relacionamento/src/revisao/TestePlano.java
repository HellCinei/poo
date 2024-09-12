package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Amil", "Checkup", "12345");
		Medico m = new Medico("Unimed", "José", "456");
		Anestesista a = new Anestesista("Amil", "Carlos", "123", "Geral");
		ControlePgto cp = new ControlePgto();
		
		c.calcualrPagamento();
		cp.calcularTotal(c);
		m.calcualrPagamento();
		cp.calcularTotal(m);
		a.calcualrPagamento();
		cp.calcularTotal(a);

		System.out.println("|-----|Clinica|-----|\n" + c);
		System.out.println("\n|-----|Médico|-----|\n" + m);
		System.out.println("\n|-----|Anestesista|-----|\n" + a);
		System.out.println("\n|-----|Total|-----|\n" + cp.getTotalPago());
	}
}
