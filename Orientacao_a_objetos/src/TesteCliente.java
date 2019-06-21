
public class TesteCliente {

	public static void main(String[] args) {
		Cliente novoCl = new Cliente();
		Cliente novoCl2 = new Cliente();
		novoCl.nome = "Daniel";
		novoCl.codCliente = 123456;
		novoCl2.nome = "Rian";
		novoCl2.codCliente = 32148745;

		System.out.println("Nome: " + novoCl.nome);
		System.out.println("Codigo: " + novoCl.codCliente);
		System.out.println("Nome 2: " + novoCl.nome);
		System.out.println("Codigo 2: " + novoCl.codCliente);
	}

}
