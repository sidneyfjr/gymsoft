package financeiro.entidade;

import cadastros.entidade.Academia;
import pessoas.entidade.OperadorCaixa;

public class Caixa  {

	private Integer			id				;
	private OperadorCaixa	operador		;
	private boolean			aberto			;
	private Double          saldo			;
	private Academia		academia		;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public OperadorCaixa getOperador() {
		return operador;
	}
	public void setOperador(OperadorCaixa operador) {
		this.operador = operador;
	}
	public boolean isAberto() {
		return aberto;
	}
	
	private void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	
	
}
