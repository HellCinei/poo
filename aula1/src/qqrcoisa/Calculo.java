package qqrcoisa;

import javax.swing.JOptionPane;

public class Calculo {
	public static void main(String[] args) {
		
		double valor1, valor2;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu primeiro n°: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu segundo n°: "));
		
		media(valor1, valor2);
	}
	
	public static void media(double valor1, double valor2) {
		JOptionPane.showMessageDialog(null, (valor1 + valor2) /2);
	}

}
