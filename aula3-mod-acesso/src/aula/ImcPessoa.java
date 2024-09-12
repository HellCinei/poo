package aula;

import javax.swing.JOptionPane;

public class ImcPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite seu código:")));
		pessoa.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:")));
		pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:")));

		JOptionPane.showMessageDialog(null, pessoa.getNome() + "\nCod.: " + pessoa.getCodigo() + "\n" + pessoa.resposta());
	}

}
