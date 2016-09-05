package pessoas;

import cadastros.Academia;
import cadastros.Convenio;
import cadastros.Origem;
import cadastros.Turmas;
import vendas.Planos;

public class Aluno extends Pessoa {
	
	private Integer     id;
	private Academia    academia;
	private Planos 		plano;
	private Turmas 		turma;
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
	public Planos getPlano() {
		return plano;
	}
	public void setPlano(Planos plano) {
		this.plano = plano;
	}
	public Turmas getTurma() {
		return turma;
	}
	public void setTurma(Turmas turma) {
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
