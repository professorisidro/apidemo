package br.com.professorisidro.apidemo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.professorisidro.apidemo.model.Chefe;
import br.com.professorisidro.apidemo.model.Comissionado;
import br.com.professorisidro.apidemo.model.Empreiteiro;
import br.com.professorisidro.apidemo.model.Funcionario;
import br.com.professorisidro.apidemo.model.Horista;

@Repository
public class FuncionarioRepo {

	private List<Funcionario> funcionarios;
	
	
	public FuncionarioRepo() {
		System.out.println("Chamando o construtor do repositório!!!");
		funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Empreiteiro(1,"Isidro", 3000.0));
		funcionarios.add(new Chefe(2, "Ananda", 5000.0, 15.0, 450.0));
		funcionarios.add(new Comissionado(3, "Ana Carol", 2500.0, 22.70));
		funcionarios.add(new Horista(4, "Carol", 150, 70.0));
		funcionarios.add(new Horista(5, "Amanda", 120, 70.0));
		
	}
	
	public List<Funcionario> findAll(){
		return this.funcionarios;
	}
}
