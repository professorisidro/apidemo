package br.com.professorisidro.apidemo.model;

public class Chefe extends Funcionario{
	private Double salarioBase;
	private Double adicionalFuncao;
	private Double beneficioTerno;
	
	public Chefe(Integer numCracha, String nome, Double salBase, Double adFunc, Double benTer) {
		super(numCracha, nome);
		this.salarioBase = salBase;
		this.adicionalFuncao = adFunc;
		this.beneficioTerno = benTer;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Double getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(Double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public Double getBeneficioTerno() {
		return beneficioTerno;
	}
	public void setBeneficioTerno(Double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}
	
	
}
