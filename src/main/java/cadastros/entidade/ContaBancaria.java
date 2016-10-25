package cadastros.entidade;

import java.util.Date;

public class ContaBancaria {

	private Integer id;
	private String nome;
	private String tipo;
	private Banco  banco;
	private Double saldoInicial;
	private Date   dtSaldoInicial;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public Double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public Date getDtSaldoInicial() {
		return dtSaldoInicial;
	}
	public void setDtSaldoInicial(Date dtSaldoInicial) {
		this.dtSaldoInicial = dtSaldoInicial;
	}
	
	
	
}
