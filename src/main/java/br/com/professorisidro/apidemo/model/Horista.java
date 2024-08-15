package br.com.professorisidro.apidemo.model;

public class Horista extends Funcionario{
	private Integer numHoras;
	private Double valorHora;
	public Horista(Integer numCracha, String nome, Integer numHoras, Double valorHora) {
		super(numCracha, nome);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}
	public Integer getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(Integer numHoras) {
		this.numHoras = numHoras;
	}
	public Double getValorHora() {
		return valorHora;
	}
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return valorHora * numHoras;
	}
}
