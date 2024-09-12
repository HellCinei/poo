package exerciciosSlide;

import javax.swing.JOptionPane;

public class InfoFuncionario {

	public static void main(String[] args) {
		
		// Envia o nome e o salário para Funcionario
		Funcionario funcionario = new Funcionario("Carol", 3000.);
		
		// Abre a janela para mostrar as informações
		// Informações separadas para melhor visibilidade
		JOptionPane.showMessageDialog(null,
				"Nome: " + funcionario.getNome() +
				"\nSalário: " + funcionario.getSalario() +
				"\nInss: " + funcionario.calcularInss() +
				"\nVale Transporte: " + funcionario.calcularVT() +
				"\nSalário Liquido: " + funcionario.salarioLiquido());
	}

}
