package pessoas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pessoas.entidade.Funcionario;
import pessoas.entidade.Pessoa;
import pessoas.persistencia.jdbc.FuncionarioDAO;

@WebServlet("/autenticador.do")
public class LoginController extends HttpServlet{
	
	// Esse bloco get garante que requisições feitas pela url sejam redirecionadas para a tela de login
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		HttpSession sessao = req.getSession(false);
		
		if (sessao != null ) {
			
			sessao.invalidate();
			
		}
		
		resp.sendRedirect("login.html");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
/*
		Pessoa p = new Pessoa();
		
		p.setLogin(login);
		p.setSenha(senha);
		
  		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa pessoaAutenticada =  pessoaDAO.autenticar(p);
		
		if (pessoaAutenticada != null ) {
			
		HttpSession sessao = req.getSession();
		sessao.setAttribute("pessoaAutenticada", pessoaAutenticada);
		sessao.setMaxInactiveInterval(60*30);
		
		req.getRequestDispatcher("WEB-INF/home.jsp").forward(req, resp);
*/
		Funcionario f = new Funcionario();
		
		f.setLogin(login);
		f.setSenha(senha);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		Pessoa pessoaAutenticada = funcionarioDAO.autenticar(f);
		
		if (pessoaAutenticada != null ) {
			
			HttpSession sessao = req.getSession();
			sessao.setAttribute("pessoaAutenticada", pessoaAutenticada);
			sessao.setMaxInactiveInterval(60*30);
			
			req.getRequestDispatcher("WEB-INF/home.jsp").forward(req, resp);
			
		} else {
			
			resp.getWriter().print("<script>window.alert('Não encontrado!'); location.href='login.html';</script>");
			
		}
		
	}

}
