package br.com.professorisidro.apidemo.service;

import java.util.List;

import br.com.professorisidro.apidemo.dto.FuncionarioDTO;
import br.com.professorisidro.apidemo.model.Funcionario;

public interface IFuncionarioService {

	public List<Funcionario> recuperarTodoMundo();
	public List<FuncionarioDTO> rodarFolha();
}
