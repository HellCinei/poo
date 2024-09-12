package exeption;

import javax.swing.JOptionPane;
@SuppressWarnings("unused")
public class Evento {
	private String email;
	private Integer idade;

	public Evento(String email, Integer idade) {
		if (idade < 18) {
			throw new IllegalArgumentException("Menor de idade não pode participar!");
		} else {
			this.email = email;
			this.idade = idade;
			JOptionPane.showMessageDialog(null, "Inscrição confirmada!");
		}
	}

	public static void main(String[] args) {
		int opcao = 0;

		do {
			try {
				String email = JOptionPane.showInputDialog("E-mail");
				Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
				Evento e = new Evento(email, idade);
				opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Informação", 0, 1);
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (opcao == 0);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
