package br.com.professorisidro.apidemo.model;

import br.com.professorisidro.apidemo.dto.FuncionarioDTO;

public abstract class Funcionario extends Object {
	protected Integer numCracha;
	protected String  nome;
	
	
	public Funcionario(Integer numCracha, String nome) {
		super();
		this.numCracha = numCracha;
		this.nome = nome;
	}
	
	
	
	public Integer getNumCracha() {
		return numCracha;
	}
	public void setNumCracha(Integer numCracha) {
		this.numCracha = numCracha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract Double calcularSalario();
	
	public FuncionarioDTO toDTO(String cargo) {
		return new FuncionarioDTO(numCracha, nome, cargo, calcularSalario());
	}
}
