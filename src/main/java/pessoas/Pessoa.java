package pessoas;

import java.util.Date;

import cadastros.Endereco;
import cadastros.Telefone;

/**
 * 
 * Pessoa é uma superclasse da qual extenderão outras, como
 * aluno, funcionário, visitante etc.
 * 
 *  Ao modelar em tabelas as superclasses viram chaves estrangeiras
 *_  Os atributos que são objetos viram chaves estrangeiras
 *
 **/

public class Pessoa {
	
	private Integer     id;
	private String     nome;
	private String     sexo;
	private Date       nascimento;
	private String     email;
	private String     rg;
	private String     cpf;
	private Endereco   endereco;
	private Telefone   telefone;
	private boolean    status;
	private String     observacao;
	private Date       dtCadastro;
	
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}    
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	
}
