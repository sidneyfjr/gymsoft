package cadastros.entidade;

public class Plano extends Produto {
	
	private Integer     id;
	private Turma 		turmas;
	private Convenio	convenio;
	private String      periodo;
	private Integer     qtdTranc;
	private Integer     qtdDiasTranc;
	private Integer     bloquearCatraca;
	private Integer     carencia;
	private Horario     horario;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Turma getTurmas() {
		return turmas;
	}
	public void setTurmas(Turma turmas) {
		this.turmas = turmas;
	}
	public Convenio getConvenio() {
		return convenio;
	}
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Integer getQtdTranc() {
		return qtdTranc;
	}
	public void setQtdTranc(Integer qtdTranc) {
		this.qtdTranc = qtdTranc;
	}
	public Integer getQtdDiasTranc() {
		return qtdDiasTranc;
	}
	public void setQtdDiasTranc(Integer qtdDiasTranc) {
		this.qtdDiasTranc = qtdDiasTranc;
	}
	public Integer getBloquearCatraca() {
		return bloquearCatraca;
	}
	public void setBloquearCatraca(Integer bloquearCatraca) {
		this.bloquearCatraca = bloquearCatraca;
	}
	public Integer getCarencia() {
		return carencia;
	}
	public void setCarencia(Integer carencia) {
		this.carencia = carencia;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}	
}
