package Exercicio1;

public class Funcionario extends Pessoa {
	
	private int codigoSetor;
	private int salario;
	private float imposto;
	float S=0;
	
	
	public Funcionario(String nome, int matricula, int idade,String estadoCivil, int codigoSetor, int salario,float imposto) {

		 super(nome,matricula,idade,estadoCivil);
		 this.codigoSetor = codigoSetor;
		 this.salario = salario;
		 this.imposto = imposto;

		 

		}


	public int getCodigoSetor() {
		return codigoSetor;
	}


	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
		
	}


	public float getImposto() {
		return (float) imposto;
	}


	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	public float salarioReal() {
		
		return S = this.getSalario() - this.getSalario()*((this.imposto)/(100)) ;
	}
}
