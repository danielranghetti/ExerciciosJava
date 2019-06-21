
public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.numero = 654321;
		conta1.saldo = 1000;
		conta1.limite = 400;
		conta2.numero = 125487;
		conta2.saldo = 2000;
		conta2.limite = 700;

		System.out.println("Número: " + conta1.numero);
		System.out.println("Saldo: " + conta1.saldo);
		System.out.println("Limite: " + conta1.limite);
		System.out.println("Número2: " + conta2.numero);
		System.out.println("Saldo2: " + conta2.saldo);
		System.out.println("Limite2: " + conta2.limite);

	}

}
