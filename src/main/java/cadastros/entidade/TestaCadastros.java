package cadastros.entidade;

import java.util.Scanner;

import pessoas.entidade.Aluno;

public class TestaCadastros {

	public static void main(String[] args) {
		
		// Instanciando aluno
		Aluno 	 aluno     = new Aluno();	
		
		// Instanciando academia
		Academia academia  = new Academia();
		
		// Instanciando Endere�o
		Endereco endereco  = new Endereco();		
		Endereco endereco2 = new Endereco();
		
		// Instanciando Bairro
		Bairro bairro = new Bairro();
		
		// Instanciando a cidade
		Cidade cidade = new Cidade();
		
		// Instanciando Estado
		Estado estado = new Estado();
		
		// Instanciando Conv�nio
		Convenio convenio = new Convenio();
		
		// Instanciando scanner
		Scanner  scan      = new Scanner(System.in);
		
		System.out.println("Academia: ");
		String nomeAcademia = scan.nextLine();
	    academia.setNome(nomeAcademia);
	    
	    System.out.println("Endere�o: ");
		String endeAcademia = scan.nextLine();
	    endereco.setNome(endeAcademia);
	    
	    academia.setEndereco(endereco);
	    
		
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		aluno.setNome(nome);
		
		System.out.println("Email: ");
		String email = scan.nextLine();
		aluno.setEmail(email);
		
		System.out.println("Endere�o: ");
		String endeAluno = scan.nextLine();
		endereco2.setNome(endeAluno);
		
		System.out.println("N�: ");
		Integer numEndeAluno = Integer.parseInt(scan.nextLine());
		endereco2.setNumero(numEndeAluno);
		
		System.out.println("Bairro: ");
		String bairroAluno = scan.nextLine();
		bairro.setNome(bairroAluno);
		
		System.out.println("Cidade: ");
		String cidadeAluno = scan.nextLine();
		cidade.setNome(cidadeAluno);
		
		System.out.println("Estado: ");
		String estadoAluno = scan.nextLine();
		estado.setNome(estadoAluno);
		
		System.out.println("Conv�nio: ");
		String nomeConvenio = scan.nextLine();
		convenio.setNome(nomeConvenio);
		
		cidade.setEstado(estado);
		bairro.setCidade(cidade);
		endereco2.setBairro(bairro);
		aluno.setEndereco(endereco2);
		aluno.setAcademia(academia);
		aluno.setConvenio(convenio);
		
		
		
		System.out.println( 
				   "----------------- CADASTRO DA ACADEMIA -------------------------------"
		+ "\n"	
		+ "\n"	+  "Academia: " + aluno.getAcademia().getNome() 
		+ "\n"	+  "Endere�o: " + aluno.getAcademia().getEndereco().getNome()
		+ "\n"	
		+ "\n"	+  "----------------- CADASTRO DO ALUNO ----------------------------------"
		+ "\n"	
		+ "\n"	+  "Aluno: " 	+ aluno.getNome()		
		+ "\n"  +  "Email: " 	+ aluno.getEmail()	
		+ "\n"  +  "Endere�o: " + aluno.getEndereco().getNome()
		+ ","   +  "n�: "       + aluno.getEndereco().getNumero()
		+ " - " +  "Bairro: "   + aluno.getEndereco().getBairro().getNome()
		+ " , " +  "Cidade: "   + aluno.getEndereco().getBairro().getCidade().getNome()
		+ " / " +  "Estado: "   + aluno.getEndereco().getBairro().getCidade().getEstado().getNome()
 		+ "\n" +  "Conv�nio: " 	+ aluno.getConvenio().getNome()
				);

		scan.close();
		
	}
   
}
