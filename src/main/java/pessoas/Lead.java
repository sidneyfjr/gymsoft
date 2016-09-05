package pessoas;

import cadastros.Origem;

public class Lead extends Pessoa {

	private Integer id;
	private Origem  origem;
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Origem getOrigem() {
		return origem;
	}
	public void setOrigem(Origem origem) {
		this.origem = origem;
	}
	
}
