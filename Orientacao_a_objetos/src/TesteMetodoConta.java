
public class TesteMetodoConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depoisitar(2500);
		conta.sacar(1500);
		conta.imprimiExtrato();
		conta.consultarSaldoDisponivel();

		System.out.println("Extrato: " + conta.imprimiExtrato());
		System.out.println("Saldo disponível com o limite: " + conta.consultarSaldoDisponivel());
	}

}
