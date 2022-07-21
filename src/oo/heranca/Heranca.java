package oo.heranca;

/*Crie as classes "Funcionario", "Gerente", "Vendedor e "Faxineiro"
 * Realize upcasts e downcasts
 */

public class Heranca {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		//upcast, o tipo de dado está implicito
		//O que existe em Funcionario existe em Gerente
		//ou seja, não perde dados
		Funcionario gerente = new Gerente(); 
		Funcionario vendedor = new Vendedor(); 
		Funcionario faxineiro = new Faxineiro();

		//downcast, precisa deixar claro o tipo de dado
		//O que tiver em Vendedor e não existir em Funcionário será perdido
		//Não é recomendado
//		Gerente gerente = new Funcionario() //Dá erro
		Vendedor vendedor2 = (Vendedor) new Funcionario(); 
	}

}
