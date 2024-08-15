package br.com.professorisidro.apidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.professorisidro.apidemo.dto.FuncionarioDTO;
import br.com.professorisidro.apidemo.model.Funcionario;
import br.com.professorisidro.apidemo.service.IFuncionarioService;

@RestController
public class FolhaController {

	
	@Autowired
	private IFuncionarioService service;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "<html><body><h1>Hello World</h1><hr/><p>O isidro fala pa um bone</p></body></html>";
	}
	
	
	@GetMapping("/funcionarios")
	public List<Funcionario> getAll(){
		return service.recuperarTodoMundo();
	}
	
	
	@GetMapping("/funcionarios/folha")
	public List<FuncionarioDTO> rodarFolhaDepagamento(){
		return service.rodarFolha();
	}
	 
}

