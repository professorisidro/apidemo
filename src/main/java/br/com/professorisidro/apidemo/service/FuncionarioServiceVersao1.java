package br.com.professorisidro.apidemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.professorisidro.apidemo.dto.FuncionarioDTO;
import br.com.professorisidro.apidemo.model.Funcionario;
import br.com.professorisidro.apidemo.repo.FuncionarioRepo;

@Service
public class FuncionarioServiceVersao1 implements IFuncionarioService {

	@Autowired
	private FuncionarioRepo repo;

	@Override
	public List<Funcionario> recuperarTodoMundo() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<FuncionarioDTO> rodarFolha() {
		// TODO Auto-generated method stub
		return null;
	};

}
