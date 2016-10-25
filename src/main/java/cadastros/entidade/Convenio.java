package cadastros.entidade;

import java.util.Date;

import pessoas.entidade.Pessoa;

public class Convenio {
	
	private Integer id;
	private String 	nome;
	private Date 	dtInicio;
	private Date 	dtFim;
	private Pessoa 	responsavel;
	private Double 	descPlano;
	private Double 	descServico;
	private String 	descricao;
	private boolean	status;
	
	//Se a data do convênio expirar ele será inativo	
    public void atualizaStatus(){
		
    	Date now = new Date(System.currentTimeMillis());
		
		if ( getDtFim().after(now) ) {
			setStatus(false);
		}
	}
	
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
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	public Pessoa getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}
	public Double getDescPlano() {
		return descPlano;
	}
	public void setDescPlano(Double descPlano) {
		this.descPlano = descPlano;
	}
	public Double getDescServico() {
		return descServico;
	}
	public void setDescServico(Double descServico) {
		this.descServico = descServico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
