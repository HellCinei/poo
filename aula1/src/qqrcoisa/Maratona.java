package qqrcoisa;

import javax.swing.JOptionPane;

public class Maratona {
	public static void main(String[] args) {

		int idade;
		double altura;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
		/*
		if (idade >= 18 || altura >= 1.70) {
			JOptionPane.showMessageDialog(null, "Pode participar da maratona!");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Não pode participar da maratona!");
		}
		*/
		String res = (idade >= 18 || altura >= 1.70 ? 
				"Pode participar da maratona!" :
				"Não pode participar da maratona!");
		
		System.out.println("O atleta: " + res);
	}
}
