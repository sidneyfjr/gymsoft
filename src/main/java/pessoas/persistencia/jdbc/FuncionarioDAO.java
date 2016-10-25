package pessoas.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pessoas.entidade.Funcionario;
import pessoas.entidade.Pessoa;

public class FuncionarioDAO {

	private Connection con = ConexaoFactory.getConnection();

	public void cadastrar(Funcionario f){

		String sql = "insert into pessoas.t_pessoa (nome,sexo, email,rg,cpf) values (?,?,?,?,?) returning pessoa_id" ;		

		try {

			PreparedStatement p = con.prepareStatement(sql);

			p.setString(1, f.getNome());
			p.setString(2, f.getSexo());
			p.setString(3, f.getEmail());
			p.setString(4, f.getRg());
			p.setString(5, f.getCpf());

			ResultSet resultado = p.executeQuery();

			if (resultado.next()) {

				Integer pessoa_id = resultado.getInt("pessoa_id");

				String sql2 = "insert into pessoas.t_funcionario (pessoa_id, login, senha) values (?,?,?) ";

				try {

					PreparedStatement p2 = con.prepareStatement(sql2);

					p2.setInt(1, pessoa_id);
					p2.setString(2, f.getLogin());
					p2.setString(3, f.getSenha());

					p2.execute();

					p2.close();				

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			p.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * 
	 * @param pessoaConsulta Um objeto pessoa que passa login e senha.
	 * @return um objeto Pessoa que retorna nome e email
	 * @throws SQLException 
	 *  
	 */
public Pessoa autenticar(Funcionario funcionarioConsulta) {	

	String sql 	= " select    pessoa_id				"
				+ "	from      pessoas.t_funcionario "
				+ "	where     login=? 				"
				+ "	and       senha=? 				" ;

	/**
	* Cria um objeto preparador do tipo PreparedStatement que é um objeto que prepapra uma consulta e 
	* retorna um conjunto de resultados (ResultSet)
	* 
	*/
	try (PreparedStatement preparador = con.prepareStatement(sql)){

		// seta na consulta o login e senha passado no parâmetro funcionarioConsulta
		preparador.setString(1, funcionarioConsulta.getLogin());
		preparador.setString(2, funcionarioConsulta.getSenha());

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
			
			p.setId(resultado.getInt("pessoa_id"));
			
			return p;
			
		} else {
		   return null;	
		}
		
		} catch (Exception e) {

			e.printStackTrace();
			
		}
			return null;
		}

	public List<Pessoa> buscarTodos() {
		
		String sql = "select pessoa_id, nome, email from pessoas.t_pessoa order by nome";
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		try (PreparedStatement p = con.prepareStatement(sql) ) {
			
			ResultSet r = 	p.executeQuery();
			
			while (r.next()) {
				
				Pessoa pessoa = new Pessoa();
				
				pessoa.setId(r.getInt("pessoa_id"));
				pessoa.setNome(r.getString("nome"));
				pessoa.setEmail(r.getString("email"));
				
				lista.add(pessoa);
								
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return lista;
	}

	
	
	}		