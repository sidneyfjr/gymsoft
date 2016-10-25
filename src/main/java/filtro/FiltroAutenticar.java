package filtro;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(dispatcherTypes={DispatcherType.REQUEST} , urlPatterns="/*")
public class FiltroAutenticar implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// Fazendo um casting dos objetos recebidos
		HttpServletRequest  httpRequest  = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response; 
		
		String 		uri    = httpRequest.getRequestURI();
		HttpSession sessao = httpRequest.getSession(false); 
	
		if (sessao != null || uri.indexOf("login.html") != -1 || uri.indexOf("autenticador.do") != -1 ) {
			chain.doFilter(request, response);
		} else {
			
			httpResponse.sendRedirect("login.html");
			
		}
				
		// System.out.println("Passou pelo filtro! ");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	

}
