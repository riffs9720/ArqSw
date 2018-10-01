package br.usjt.arqsw18.pipoca.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqsw18.pipoca.beans.Filme;

@Controller
public class CadastrarFilmeController {
	
	@RequestMapping("/cadastrar")
	public String execute(){
		return "cadastrarFilme";
	}
	
	public String m(Filme f) {
		int id = new Random().nextInt();
		
		return "Cadastrado";
	}
}