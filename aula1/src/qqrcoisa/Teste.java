package qqrcoisa;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		//Isso é um comentário
		
		String texto = "Roni";
		System.out.println("Hello World! ");
		System.out.println("Java!" + texto);
		JOptionPane.showMessageDialog(null, "Hello World!");
		texto = JOptionPane.showInputDialog("Digite o seu nome:");
		JOptionPane.showMessageDialog(null, texto);
	}

}