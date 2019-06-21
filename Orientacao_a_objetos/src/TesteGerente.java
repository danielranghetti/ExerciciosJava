
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.Nome = "Jean";
		gerente.salario = 10000;
		
		gerente.aumentoFixo();
		gerente.aumentotaxa(0.50);
		
		System.out.println("Nome: " + gerente.Nome + "\n" + "Salário: " + gerente.salario);
		
		
	}

}
