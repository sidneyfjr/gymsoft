package pessoas.entidade;

import cadastros.entidade.Academia;
import cadastros.entidade.Convenio;
import cadastros.entidade.Origem;
import cadastros.entidade.Plano;
import cadastros.entidade.Turma;

public class Aluno extends Pessoa {
	
	private Integer     id;
	private Academia    academia;
	private Plano 		plano;
	private Turma 		turma;
	private Convenio 	convenio;
	private Consultor   consultor;
	private Origem      origem;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	public Plano getPlano() {
		return plano;
	}
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Convenio getConvenio() {
		return convenio;
	}
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	public Consultor getConsultor() {
		return consultor;
	}
	public void setConsultor(Consultor consultor) {
		this.consultor = consultor;
	}
	public Origem getOrigem() {
		return origem;
	}
	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	
}
