
public class TesteFuncionaro {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();

		func1.nomeFuncionari = "Isac";
		func1.salario = 1980.50;
		func1.aumentoSalario(1000);
		func1.consultaDadosFuncionari();
						
		func2.nomeFuncionari = "Ivan";
		func2.salario = 1785.80;
		func2.aumentoSalario(500);
		func2.consultaDadosFuncionari();
		
		System.out.println("Nome 1: " + func1.nomeFuncionari + "\n" + "Salário 1:" + func1.salario + 
				"\n" + "Dados: " + func1.consultaDadosFuncionari());
		System.out.println("Nome 2: " + func2.nomeFuncionari + "\n" + "Salário 2: " + func2.salario + 
				"\n" + "Dados: " + func2.consultaDadosFuncionari());

	}

}
