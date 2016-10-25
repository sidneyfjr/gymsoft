package pessoas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pessoas.entidade.Pessoa;
import pessoas.persistencia.jdbc.PessoaDAO;

/**
 * 
 * @author sid
 * No momento em que é feita a requisição http://localhost:8080/gymsoft/pessoacontroller, o Tomcat
 * irá instanciar os objetos HttpServletRequest e HttpServletResponse. Instanciar o objeto PessoaController
 * e invocar o métod doGet passando o request e response como parâmetros.
 *
 */

// http://localhost:8080/gymsoft/pessoacontroller
@WebServlet("/pessoacontroller")
public class PessoaController extends HttpServlet {
	  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
			String nome  = req.getParameter("nome");
			String login = req.getParameter("login");
			String senha = req.getParameter("senha");
			
			Pessoa p = new Pessoa();
			
			p.setNome(nome);
			p.setLogin(login);
			p.setSenha(senha);
			
			PessoaDAO pessoaDAO = new PessoaDAO();
			
			pessoaDAO.salvar(p);
			
			resp.getWriter().print("<h1>Sucesso!</h1>");
		
		}
		
	}

