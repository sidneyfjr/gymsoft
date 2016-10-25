package pessoas.entidade;

import cadastros.entidade.Academia;

public class Funcionario extends Pessoa {

	private Academia 	  academia;
	private boolean       acessoSistema;  
	private String        login;
	private String        senha;
	
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	public boolean isAcessoSistema() {
		return acessoSistema;
	}
	public void setAcessoSistema(boolean acessoSistema) {
		this.acessoSistema = acessoSistema;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
