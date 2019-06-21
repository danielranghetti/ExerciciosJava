
public class TesteAlunoTurma {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Turma turma = new Turma();

		aluno.nomeAluno = "Rian";
		turma.periodo = "Matutino";

		aluno.turma = turma;

		System.out.println("Dados: " + aluno.nomeAluno + "\n" + aluno.turma.periodo);
	}

}
