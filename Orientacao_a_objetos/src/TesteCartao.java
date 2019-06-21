
public class TesteCartao {

	public static void main(String[] args) {
		CartaoDeCredito cdc = new CartaoDeCredito();
		cdc.dataDeValidade = "20/06/2022";
		cdc.numero = 89523745;

		System.out.println("Data Validade: " + cdc.dataDeValidade);
		System.out.println("Número: " + cdc.numero);
	}

}
