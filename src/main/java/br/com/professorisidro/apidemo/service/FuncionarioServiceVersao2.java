package br.com.professorisidro.apidemo.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.com.professorisidro.apidemo.dto.FuncionarioDTO;
import br.com.professorisidro.apidemo.model.Funcionario;
import br.com.professorisidro.apidemo.repo.FuncionarioRepo;

@Service
@Primary
public class FuncionarioServiceVersao2 implements IFuncionarioService{

	@Autowired
	private FuncionarioRepo repo;
	
	@Override
	public List<Funcionario> recuperarTodoMundo() {
		// TODO Auto-generated method stub
		return repo.findAll().stream().sorted(Comparator.comparing(Funcionario::getNome)).toList();
	}

	@Override
	public List<FuncionarioDTO> rodarFolha() {
		// TODO Auto-generated method stub
		return repo.findAll().stream().map(f -> f.toDTO(f.getClass().getSimpleName())).toList();
	}
	

}
