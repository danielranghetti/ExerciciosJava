
public class TesteTurma {

	public static void main(String[] args) {
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
		turma1.periodo = "Matutino";
		turma1.serie = "2�";
		turma1.sigla = "JG";
		turma1.ensino = "Primario";
		turma2.periodo = "Vespertino";
		turma2.serie = "8�";
		turma2.sigla = "JG";
		turma2.ensino = "Fundamental";
		
		System.out.println("Per�odo 1: " + turma1.periodo + "\n" + "S�rie 1: " + turma1.serie 
									+ "\n" + "Sigla 1:"  + turma1.sigla + "\n" + "ensino 1: " + turma1.ensino );
		System.out.println("Per�odo 2: " + turma2.periodo + "\n" + "S�rie 2: " + turma2.serie 
				+ "\n" + "Sigla 2:"  + turma2.sigla + "\n" + "ensino 2: " + turma2.ensino );
		
	}

}
