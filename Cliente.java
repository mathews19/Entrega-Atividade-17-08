package Exercicio1;

public class Cliente extends Pessoa {
private String grauFidelidade;


public Cliente(String nome,int matricula, int idade, String estadoCivil, String grauFidelidade) {

 super(nome,matricula,idade,estadoCivil);
 this.grauFidelidade = grauFidelidade;

}


public String getGrauFidelidade() {
	return grauFidelidade;
}


public void setGrauFidelidade(String grauFidelidade) {
	this.grauFidelidade = grauFidelidade;
}


}
