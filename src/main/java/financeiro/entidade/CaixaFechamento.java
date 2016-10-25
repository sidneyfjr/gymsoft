package financeiro.entidade;

import java.util.Date;

import pessoas.entidade.Funcionario;

public class CaixaFechamento {
	
	private Integer 		id				;
	private CaixaAbertura	aberturaCaixa	; 
	private Date 			dtFechamento	;
	private Double			saldo			;
	private Funcionario		conferente		;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CaixaAbertura getAberturaCaixa() {
		return aberturaCaixa;
	}
	public void setAberturaCaixa(CaixaAbertura aberturaCaixa) {
		this.aberturaCaixa = aberturaCaixa;
	}
	public Date getDtFechamento() {
		return dtFechamento;
	}
	public void setDtFechamento(Date dtFechamento) {
		this.dtFechamento = dtFechamento;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Funcionario getConferente() {
		return conferente;
	}
	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
	}

}
