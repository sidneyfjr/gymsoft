package pessoas.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pessoas.entidade.Pessoa;

public class PessoaDAO {

	private  Connection con = ConexaoFactory.getConnection();
	
	/**
	 * 
	 * @param p é um objeto Pessoa que será inserido no banco.
	 */
	
	public void cadastrar(Pessoa p) {
		
		String sql = "insert into t_pessoa ( nome, login, senha) values (?,?,?) ";
		
		try {
			
		PreparedStatement preparador = con.prepareStatement(sql);
		
		preparador.setString(1, p.getNome());
		preparador.setString(2, p.getLogin());
		preparador.setString(3, p.getSenha());
		
		preparador.executeQuery();
		preparador.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param p é um objeto Pessoa que será alterado no banco.
	 */
	public void alterar(Pessoa p) {
		
		String sql = "update t_pessoa set nome=?, email=? where pessoa_id=?";
		
		try {
			
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setString(1, p.getNome());
			preparador.setString(2, p.getEmail());
			preparador.setInt(3, p.getId());
			
			preparador.executeQuery();
			preparador.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}

	public void excluir(Pessoa p) {
		
		String sql = "delete from t_pessoa where pessoa_id = ?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setInt(1, p.getId());
			
			preparador.executeQuery();
			preparador.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public void salvar(Pessoa p){
		
		if (p.getId() != null) {
			alterar(p);
		} else {
			cadastrar(p);
		}
		
	}
	
	/**
	 * Busca um registro pelo id da Pessoa.
	 * @param id É um inteiro que representa o id da pessoa a ser buscada.
	 * @return um objeto Pessoa ou null quando não encontra.
	 */
	
	public Pessoa buscarPorId(Integer id){
		
	//	String sql = "select nome, email from t_pessoa where pessoa_id =?";
		
	//	try (PreparedStatement preparador = con.prepareStatement(sql)){
			
		try (PreparedStatement preparador = con.prepareStatement("select nome, email from t_pessoa where pessoa_id =?")){
			
			preparador.setInt(1, id);
			
			ResultSet resultado = preparador.executeQuery();
			
			if (resultado.next()){
				
				Pessoa p = new Pessoa();
				
				p.setId(id);
				p.setNome(resultado.getString("nome"));
				p.setEmail(resultado.getString("email"));
				
				return p;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return null;
		
	}
	
	public List<Pessoa> buscarTodos(){
		
		String sql = "select pessoa_id, nome , email from t_pessoa";
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				
				Pessoa p = new Pessoa();
				
				p.setId(resultado.getInt("pessoa_id"));
				p.setNome(resultado.getString("nome"));
				p.setEmail(resultado.getString("email"));
				
				lista.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();			
			
		}
		return lista;		
	}
	
	/**
	 * 
	 * @param pessoaConsulta Um objeto pessoa que passa login e senha.
	 * @return um objeto Pessoa que retorna nome e email
	 *  
	 */
	public Pessoa autenticar(Pessoa pessoaConsulta){		
		
		String sql = "select nome, email from t_pessoa where login=? and senha=?";
		
		/**
		 * Cria um objeto preparador do tipo PreparedStatement que é um objeto que prepapra uma consulta e 
		 * retorna um conjunto de resultados (ResultSet)
		 * 
		 */
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			
			// seta na consulta o login e senha passado no parâmetro pessoaConsulta
			preparador.setString(1, pessoaConsulta.getLogin());
			preparador.setString(2, pessoaConsulta.getSenha());
			
			/**
			 * O objeto resultado do tipo Resultset recebe o resultado da consulta.
			 */
			ResultSet resultado = preparador.executeQuery();
			
			/**
			 *  O método next é um cursor que aponta para cada linha retornada pela consulta.
			 *  Se não houver linhas ele sai do if.
			 */
			if (resultado.next()) {
			
			/**
			 * Cria um objeto Pessoa para receber os dados do Resultset.
			 */
			Pessoa p = new Pessoa();
			p.setNome(resultado.getString("nome"));
			p.setEmail(resultado.getString("email"));
			
			return p;
			
			} else {
				
				return null;
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		
		return null;
	}

}
