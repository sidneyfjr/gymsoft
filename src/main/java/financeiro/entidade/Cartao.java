package financeiro.entidade;

import java.util.Date;

public class Cartao extends FormaPagamento {
	
	private String  titular 		;
	private String  numero			;
	private Date    validade 		;
	private Integer codigoSeguranca	;
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public Integer getCodigoSeguranca() {
		return codigoSeguranca;
	}
	public void setCodigoSeguranca(Integer codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	
	

}
