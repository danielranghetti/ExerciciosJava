
public class TesteTurma {

	public static void main(String[] args) {
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
		turma1.periodo = "Matutino";
		turma1.serie = "2ª";
		turma1.sigla = "JG";
		turma1.ensino = "Primario";
		turma2.periodo = "Vespertino";
		turma2.serie = "8ª";
		turma2.sigla = "JG";
		turma2.ensino = "Fundamental";
		
		System.out.println("Período 1: " + turma1.periodo + "\n" + "Série 1: " + turma1.serie 
									+ "\n" + "Sigla 1:"  + turma1.sigla + "\n" + "ensino 1: " + turma1.ensino );
		System.out.println("Período 2: " + turma2.periodo + "\n" + "Série 2: " + turma2.serie 
				+ "\n" + "Sigla 2:"  + turma2.sigla + "\n" + "ensino 2: " + turma2.ensino );
		
	}

}
