package br.com.professorisidro.apidemo.model;

public class Comissionado extends Funcionario{
	private Double salarioBase;
	private Double comissao;
	public Comissionado(Integer numCracha, String nome, Double salarioBase, Double comissao) {
		super(numCracha, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Double getComissao() {
		return comissao;
	}
	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase * comissao / 100;
	}	
}
