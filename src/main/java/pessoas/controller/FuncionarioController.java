package pessoas.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pessoas.entidade.Funcionario;
import pessoas.entidade.Pessoa;
import pessoas.persistencia.jdbc.FuncionarioDAO;

@WebServlet("/funcionario.do")
public class FuncionarioController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String acao = req.getParameter("acao");
		
/*		if (acao.equals("exc")) {
			
			String id = req.getParameter("id");
			Funcionario f = new Funcionario();
			if (id != null) {
				f.setId(Integer.parseInt(id));
				FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
				funcionarioDAO.excluir(f);
				resp.getWriter().println("Excluído com sucesso!");
			} 
			
		} else if (acao.equal("lis")) {
			
			FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
			List<Funcionario> lista = funcionarioDAO.buscarTodos();
			resp.getWriter().println(lista);
		}
		
     	if (acao.equals("lis")) {
			
			req.getRequestDispatcher("WEB-INF/funcionario.jsp").forward(req, resp);
			
			FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
			List<Pessoa> lista = funcionarioDAO.buscarTodos();
			
			req.setAttribute("lista", lista);
		
			RequestDispatcher d = req.getRequestDispatcher("WEB-INF/funcionario.jsp");
			d.forward(req, resp);
		
     	}
     	*/
		
		req.getRequestDispatcher("WEB-INF/funcionario.jsp").forward(req, resp);

	 }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String 	nome   		= req.getParameter("nome");
		String  sexo        = req.getParameter("sexo");
		String 	email  		= req.getParameter("email");
		String 	rg     		= req.getParameter("rg");
		String 	cpf    		= req.getParameter("cpf");		
		String 	login  		= req.getParameter("login");
		String 	senha  		= req.getParameter("senha");
		
		Funcionario f = new Funcionario();
		
		f.setNome(nome);
		f.setSexo(sexo);
		f.setEmail(email);
		f.setRg(rg);
		f.setCpf(cpf);
		f.setLogin(login);
		f.setSenha(senha);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		funcionarioDAO.cadastrar(f);
		
	}	

}
