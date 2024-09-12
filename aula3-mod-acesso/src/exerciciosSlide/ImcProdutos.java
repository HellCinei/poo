package exerciciosSlide;

import javax.swing.JOptionPane;

public class ImcProdutos {

	public static void main(String[] args) {

		Produto p = new Produto();
		Integer quit = 1;
		while (quit != 0) {

			if (quit == 1) {
				p.setNome(JOptionPane.showInputDialog("Digite o nome do seu produto: "));
				p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu produto: ")));
				p.setQuantidade(
						Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade do seu produto: ")));

				JOptionPane.showMessageDialog(null,
						"Descrição: " + p.getNome() +
						"\nValor: " + p.getValor() +
						"\nTotal: " + p.getTotal() +
						"\nIMCs: " + p.calcularImc());
				quit = Integer.parseInt(JOptionPane.showInputDialog("\nDeseja inspecionar outro produto?\n1-Sim\n0-Não"));
			} else if (quit == 0) {
				
			} else {
				JOptionPane.showMessageDialog(null, "Essa náo uma opção válida!");
			}
		}
	}
}
