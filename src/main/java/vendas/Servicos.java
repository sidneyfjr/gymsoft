package vendas;

import cadastros.Convenio;
import cadastros.Produtos;

public class Servicos extends Produtos {

	private Integer  id;
	private Convenio convenio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	
	
}
