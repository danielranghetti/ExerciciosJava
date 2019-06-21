
public class TesteContaAgencia {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		Conta conta = new Conta();

		agencia.numero = 1528;
		conta.numero = 6587453;
		conta.limite = 1000;
		conta.saldo = 2800;
		conta.agencia = agencia;

		System.out.println("Dados conta e agência: " + conta.agencia.numero + "\n" + conta.numero + "\n" + conta.limite
				+ "\n" + conta.saldo + "\n" + conta.saldo);
	}

}
