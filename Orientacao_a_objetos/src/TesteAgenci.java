
public class TesteAgenci {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		Agencia agencia2 = new Agencia();

		agencia.numero = 75342;
		agencia2.numero = 698532;

		System.out.println("Agencia: " + agencia.numero);
		System.out.println("Agencia2: " + agencia2.numero);
	}

}
