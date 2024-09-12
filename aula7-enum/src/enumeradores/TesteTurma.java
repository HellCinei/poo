package enumeradores;

public class TesteTurma {

	public static void main(String[] args) {
		
		Turma turma = new Turma(123, PeriodoCurso.INTEGRAL);
		
		//System.out.println("Curso: " + turma.getNumero());
		//System.out.println("Dias: " + turma.getPeriodoCurso().getDIAS());
		//System.out.println("Carga Horária: " + turma.getPeriodoCurso().getCARGAHORARIA());
		//System.out.println("Valor: " + turma.getPeriodoCurso().getVALOR());
		
		System.out.println(turma);
	}

}
