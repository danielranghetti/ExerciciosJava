
public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();

		aluno1.nomeAluno = "Mariana";
		aluno1.rg = 24568798;
		aluno1.datanascimento = "10/08/1991";
		aluno2.nomeAluno = "Eduardo";
		aluno2.rg = 98548297;
		aluno2.datanascimento = "12/07/1998";

		System.out.println("Nome 1: " + aluno1.nomeAluno);
		System.out.println("RG 1: " + aluno1.rg);
		System.out.println("Data nascimento 1: " + aluno1.datanascimento);
		System.out.println("Nome 2: " + aluno2.nomeAluno);
		System.out.println("RG 2: " + aluno2.rg);
		System.out.println("Data nascimento 2: " + aluno2.datanascimento);
	}

}
