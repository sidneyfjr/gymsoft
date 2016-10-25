package financeiro.entidade;

import java.util.Scanner;

public class TestaFinanceiro {

	public static void main(String[] args) {

	// Abrir um caixa 
    // Fazer uma venda
    // Fechar o caixa
	
	Scanner 	scan 		= new Scanner(System.in);
	Caixa 		caixa 		= new Caixa();

	boolean caixaAberto = false;
	
	System.out.println("------ CAIXA ------");
	System.out.println("Login: ");
	String login = scan.next();
	System.out.println("Senha: ");
	String senha = scan.next();
	
	if ( login.equalsIgnoreCase("sidney")&& senha.equalsIgnoreCase("123") ) {
		caixaAberto = true;
		System.out.println("Caixa Aberto!");
	}  else System.out.println("Falha de autenticação!");
	
	if (caixaAberto == true) {
		System.out.println("Informe o fundo de troco: ");
		double fundoTroco = scan.nextDouble();
		// System.out.println("Seu fundo de troco é " + fundoTroco );
	}
	
	
	
	scan.close();
	}

}
