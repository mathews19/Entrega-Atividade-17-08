package Exercicio1;

public class Administrador extends Pessoa{

	public int ajudaDeCusto;
	
	public Administrador(String nome,int matricula, int idade,String estadoCivil, int ajudaDeCusto) {

		 super(nome,matricula,idade,estadoCivil);
		 this.ajudaDeCusto = ajudaDeCusto;
		 

		}

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
