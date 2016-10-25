package financeiro.entidade;

import java.util.Date;

import cadastros.entidade.Produto;
import pessoas.entidade.Cliente;
import pessoas.entidade.Consultor;
import pessoas.entidade.OperadorCaixa;

/**
 * Vendas é uma superclasse da qual se origina classe como 
 * matrícula, rematrícula, renovação, venda avulsa etc.
 *
 */
public class Venda {
	
	private Integer   		id;
	private Cliente   		cliente;
	private Produto  		produtos;
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
	public Produto getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto produtos) {
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
