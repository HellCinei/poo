package aula;

import javax.swing.JOptionPane;

public class GerarFolha {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
		funcionario.setNome(JOptionPane.showInputDialog("Digite seu nome"));
		funcionario.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:")));

		JOptionPane.showMessageDialog(null,
				"Nome" + funcionario.getNome() + " sal. Liq.: " + funcionario.calcularFolha());
		JOptionPane.showMessageDialog(null, "Folha gerada com sucesso.");
		System.out.println("Total de funcionários cadastrados: " + Funcionario.getTotal());
	}
}
