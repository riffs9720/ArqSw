package br.usjt.arqsw18.pipoca.model.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import br.usjt.arqsw18.pipoca.model.dao.GeneroDAO;
import br.usjt.arqsw18.pipoca.model.entity.Genero;

@Service //Para que a injeção dependencia possa acontecer
public class GeneroService {
	private GeneroDAO dao;
	
	public GeneroService(GeneroDAO gdao) {
		this.dao = gdao;
	}
	
	public Genero buscarGenero(int id) throws IOException {
		return dao.buscarGenero(id);
	}
	
	public ArrayList<Genero> listarGeneros() throws IOException{
		return dao.listarGeneros();
	}

}
