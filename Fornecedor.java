package Exercicio1;

public class Fornecedor extends Pessoa{

	public int valorDivida;
	public int valorCredito;
	
	public Fornecedor(String nome,int matricula, int idade,String estadoCivil, int valorDivida, int valorCredito) {

		 super(nome,matricula,idade,estadoCivil);
		 this.valorDivida = valorDivida;
		 this.valorCredito = valorCredito;

		}

	public int getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}
	
 public int obterSaldo() {
	
	return  this.valorCredito - this.valorDivida;
 }
}
