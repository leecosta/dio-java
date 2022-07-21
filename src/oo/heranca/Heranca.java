package oo.heranca;

/*Crie as classes "Funcionario", "Gerente", "Vendedor e "Faxineiro"
 * Realize upcasts e downcasts
 */

public class Heranca {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		Funcionario gerente = new Gerente(); //upcast
		Funcionario vendedor = new Vendedor(); // o tipo de dado está implícito
		Funcionario faxineiro = new Faxineiro();

		//downcast, precisa deixar claro o tipo de dado
//		Gerente gerente = new Funcionario() //Dá erro
		Vendedor vendedor2 = (Vendedor) new Funcionario(); 
	}

}
