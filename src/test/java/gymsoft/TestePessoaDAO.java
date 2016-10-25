package gymsoft;

import java.util.List;

import pessoas.entidade.Funcionario;
import pessoas.entidade.Pessoa;
import pessoas.persistencia.jdbc.PessoaDAO;

public class TestePessoaDAO {

	public static void main(String[] args) {
	
		testeExcluir();		
	}
	
	
	public static void testeSalvar(){
		
		Pessoa p = new Pessoa();
		// p.setId(3);
		p.setNome("Sidney França");
		p.setEmail("sidneyf@gmail.com");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		pessoaDAO.salvar(p);
		
		System.out.println("Salvo com sucesso!");
		
		Funcionario f = new Funcionario();
				
	}
	
	public static void testeAlterar() {
		
		Pessoa p = new Pessoa();
		
		p.setId(1);
		p.setNome("Arthur Gustavo Soares de França");
		p.setEmail("arthurgsf@gmail.com");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		pessoaDAO.alterar(p);
		
		System.out.println("Alterado com sucesso!");
		
	}

	public static void testeExcluir() {
		
		Pessoa p = new Pessoa();
		
		p.setId(7);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		pessoaDAO.excluir(p);
		
		System.out.println("Excluído com sucesso!");
		
	}

	public static void testeCadastrar() {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Arthur Gustavo Gomes Soares de França");
		p.setEmail("arthurggsf@gmail.com");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		pessoaDAO.cadastrar(p);
		
		System.out.println("Cadastrado com sucesso!");
		
	}
	
	private static void testeBuscarPorId(){
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa p = pessoaDAO.buscarPorId(3);
		
		System.out.println("Id: " + p.getId() + " Nome: " + p.getNome() + " Email: " + p.getEmail());
		
	}
	
	private static void testeBuscarTodos(){
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		List<Pessoa> lista = pessoaDAO.buscarTodos();
		
		for(Pessoa p : lista){
			System.out.println("Id: " + p.getId() + " Nome: " + p.getNome() + " Email: " + p.getEmail());
		}
		
	}

		
	private static void testeAutenticar() {
	
		/**
		 * Cria um objeto Pessoa que será a entrada do método autenticar.
		 */
		Pessoa p = new Pessoa();
		p.setLogin("sid");
		p.setSenha("789");
		
		// Instancia um objeto PessoaDAO para acessar o método autenticar
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		// Instancia um objetp Pessoa para receber o retorno do método autenticar
		Pessoa pessoaRetorno =  pessoaDAO.autenticar(p);
		
		System.out.println("Nome: " + pessoaRetorno.getNome() + " email: " + pessoaRetorno.getEmail());
		
	}
	
}
