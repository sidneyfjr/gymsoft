package financeiro.entidade;

import java.util.Date;

import pessoas.entidade.OperadorCaixa;
import pessoas.entidade.Pessoa;

public class Entrada {
	
	private Integer 		id				;
	private OperadorCaixa	operadorCaixa	;
	private CaixaAbertura	caixaAbertura	;
	private Double			valor			;
	private FormaPagamento  formaPagamento	;
	private Date			data			;
	private Pessoa			pessoa			;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public OperadorCaixa getOperadorCaixa() {
		return operadorCaixa;
	}
	public void setOperadorCaixa(OperadorCaixa operadorCaixa) {
		this.operadorCaixa = operadorCaixa;
	}
	public CaixaAbertura getCaixaAbertura() {
		return caixaAbertura;
	}
	public void setCaixaAbertura(CaixaAbertura caixaAbertura) {
		this.caixaAbertura = caixaAbertura;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
