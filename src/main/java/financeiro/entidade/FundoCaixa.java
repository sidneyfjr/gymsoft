package financeiro.entidade;

import pessoas.entidade.Pessoa;

public class FundoCaixa extends Entrada {

	private Integer 	id			;
	private Pessoa		conferente 	;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pessoa getConferente() {
		return conferente;
	}
	public void setConferente(Pessoa conferente) {
		this.conferente = conferente;
	}
	
	
	
}
