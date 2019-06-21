
public class TesteCartaoCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito();
		c.nome = "Daniel";
		cdc.numero = 12345678;
		cdc.dataDeValidade = "21/08/2022";
		cdc.cliente = c;

		System.out.println("Dados cliente e cartão: " + cdc.cliente.nome + 
									"\n" + cdc.numero + "\n" + cdc.dataDeValidade);

	}

}
