
public class Funcionario {
	String nomeFuncionari;
	double salario;
	
	double aumentoSalario (double valor) {
		return this.salario += valor;
	}
	
	String consultaDadosFuncionari () {
		return this.salario + " / " + this.nomeFuncionari;
	}

}
