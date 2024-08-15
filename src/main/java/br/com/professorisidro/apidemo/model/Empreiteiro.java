package br.com.professorisidro.apidemo.model;

public class Empreiteiro extends Funcionario{
	private Double valorEmpreita;

	public Empreiteiro(Integer numCracha, String nome, Double valorEmpreita) {
		super(numCracha, nome);
		this.valorEmpreita = valorEmpreita;
	}

	public Double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(Double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}
	

}
