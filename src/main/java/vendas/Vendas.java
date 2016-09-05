package vendas;

import java.util.Date;

import cadastros.Produtos;
import pessoas.OperadorCaixa;
import pessoas.Cliente;
import pessoas.Consultor;

/**
 * Vendas é uma superclasse da qual se origina classe como 
 * matrícula, rematrícula, renovação, venda avulsa etc.
 *
 */
public class Vendas {
	
	private Integer   		id;
	private Cliente   		cliente;
	private Produtos  		produtos;
	private Double    		total;
	private Date     		data;
	private Consultor 		consultor;
	private OperadorCaixa   operadorCaixa;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produtos getProdutos() {
		return produtos;
	}
	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Consultor getConsultor() {
		return consultor;
	}
	public void setConsultor(Consultor consultor) {
		this.consultor = consultor;
	}
	
	public OperadorCaixa getOperadorCaixa() {
		return operadorCaixa;
	}
	public void setOperadorCaixa(OperadorCaixa operadorCaixa) {
		this.operadorCaixa = operadorCaixa;
	}
	
	
}
