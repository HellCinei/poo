package exercicioSlide;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();

		alunos.add(new Aluno("Haroldo", 9.5, 11.));
		alunos.add(new Aluno("Helcinei", 8.5, 10.));
		alunos.add(new Aluno("Mikhael", -1., 7.));

		for (Aluno aluno : alunos) {
			try {
				System.out.println(aluno);
			} catch (AlunoException ae) {
				System.err.println(ae.getMessage());
			}
		}
	}
}
