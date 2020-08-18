package Exercicio1;

public class teste {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("João", 111,25,"solteiro");
		Fornecedor carlos = new Fornecedor("Carlos", 222,45,"solteiro",450,600);
		Funcionario pedro = new Funcionario("Pedro", 223,33,"casado", 777, 1000,10);
		
		System.out.println("O valor do saldo com fornecedor é de:");
		System.out.println(carlos.obterSaldo());
		System.out.println("O valor do salário do(a) "+pedro.getNome()+" é de");
		System.out.println(pedro.salarioReal());
	}

}
