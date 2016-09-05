package cadastros;

import pessoas.Professor;
import vendas.Planos;

public class Turmas {
	
	private Integer   	id;
	private String    	nome;
	private Local     	local;
	private String    	sexo;
	private Integer   	lotacaoMinima;
	private Integer   	lotacaoMaxima;
	private Professor 	professor;
	private Horario   	horario;
	private Academia  	academia;
	private Integer   	lotacaoAtual;
	private boolean   	aberta;
	private Planos      planos;
	private boolean     status;
	
	

	// Se a academia estiver lotada não pode receber mais alunos
	public void statusTurma(){
		if ( getLotacaoAtual() < getLotacaoMaxima() ) {
			 setAberta(true);
		} else setAberta(false);
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
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getLotacaoMinima() {
		return lotacaoMinima;
	}
	public void setLotacaoMinima(Integer lotacaoMinima) {
		this.lotacaoMinima = lotacaoMinima;
	}
	public Integer getLotacaoMaxima() {
		return lotacaoMaxima;
	}
	public void setLotacaoMaxima(Integer lotacaoMaxima) {
		this.lotacaoMaxima = lotacaoMaxima;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	public Integer getLotacaoAtual() {
		return lotacaoAtual;
	}
	public void setLotacaoAtual(Integer lotacaoAtual) {
		this.lotacaoAtual = lotacaoAtual;
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	} 
	
	public Planos getPlanos() {
		return planos;
	}

	public void setPlanos(Planos planos) {
		this.planos = planos;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
