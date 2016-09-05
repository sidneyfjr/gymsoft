package pessoas;

import cadastros.Convenio;
import cadastros.Origem;

public class Visitante extends Pessoa {
	
	private Integer   id;
	private Consultor consultor;
	private Convenio  convenio;
	private Origem    origem;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Consultor getConsultor() {
		return consultor;
	}
	public void setConsultor(Consultor consultor) {
		this.consultor = consultor;
	}
	public Convenio getConvenio() {
		return convenio;
	}
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	public Origem getOrigem() {
		return origem;
	}
	public void setOrigem(Origem origem) {
		this.origem = origem;
	}
		

}
