package cadastros;

/**
 * 
 * Produtos é uma superclasse da qual extenderão outras, 
 * como planos, serviços etc.
 *
 */
public class Produtos {
	
	private Integer id;
	private String 	nome;
	private Double 	valor;
	private Double 	desconto;
	private boolean	status;
	private Double 	qtdParcelas;
	private Double 	comissao;
	private String 	descricao;
	private boolean promocional;
	
	
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Double getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(Double qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	public Double getComissao() {
		return comissao;
	}
	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescrição(String descricao) {
		this.descricao = descricao;
	}
	public boolean isPromocional() {
		return promocional;
	}
	public void setPromocional(boolean promocional) {
		this.promocional = promocional;
	}
	
	

}
