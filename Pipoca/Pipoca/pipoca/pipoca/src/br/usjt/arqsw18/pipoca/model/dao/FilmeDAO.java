package br.usjt.arqsw18.pipoca.model.dao;

import java.io.IOException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.usjt.arqsw18.pipoca.model.entity.Filme;

@Repository
public class FilmeDAO {
	
	@PersistenceContext //Injeção de dependencia do EntityManager
	EntityManager manager;
	
	public int inserirFilme(Filme filme) throws IOException {
		manager.persist(filme);		
		return filme.getId();
	}	
	
	public Filme buscarFilme(int id) throws IOException{
		return manager.find(Filme.class, id);		
	}
	
	public void atualizarFilme(Filme filme) throws IOException {
		manager.merge(filme);		
	}
	
	public void removerFilme(Filme filme) throws IOException {
		manager.remove(manager.find(Filme.class, filme.getId()));
	}
	
	public ArrayList<Filme> listarFilmes(String chave) throws IOException {
		ArrayList<Filme> lista = new ArrayList<>();
		
		/*String sql = "select f.id, f.titulo, f.descricao, f.diretor, f.posterpath, "
				+ "f. popularidade, f.data_lancamento, f.id_genero, g.nome "
				+ "from filme f, genero g "
				+ "where f.id_genero = g.id and upper(f.titulo) like ?";
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql);){
			
			pst.setString(1, "%" + chave.toUpperCase() + "%");
		
			try(ResultSet rs = pst.executeQuery();){
			
				Filme filme;
				Genero genero;
				while(rs.next()) {
					filme = new Filme();
					filme.setId(rs.getInt("f.id"));
					filme.setTitulo(rs.getString("f.titulo"));
					filme.setDescricao(rs.getString("f.descricao"));
					filme.setDiretor(rs.getString("f.diretor"));
					filme.setPosterPath(rs.getString("f.posterpath"));
					filme.setDataLancamento(rs.getDate("f.data_lancamento"));
					genero = new Genero();
					genero.setId(rs.getInt("f.id_genero"));
					genero.setNome(rs.getString("g.nome"));
					filme.setGenero(genero);
					lista.add(filme);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}*/
				
		return lista;
	}
	
	public ArrayList<Filme> listarFilmes() throws IOException {
		ArrayList<Filme> lista = new ArrayList<>();
		/*String sql = "select f.id, f.titulo, f.descricao, f.diretor, f.posterpath, "
				+ "f. popularidade, f.data_lancamento, f.id_genero, g.nome "
				+ "from filme f, genero g "
				+ "where f.id_genero = g.id";
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();){
			
			Filme filme;
			Genero genero;
			while(rs.next()) {
				filme = new Filme();
				filme.setId(rs.getInt("f.id"));
				filme.setTitulo(rs.getString("f.titulo"));
				filme.setDescricao(rs.getString("f.descricao"));
				filme.setDiretor(rs.getString("f.diretor"));
				filme.setPosterPath(rs.getString("f.posterpath"));
				filme.setDataLancamento(rs.getDate("f.data_lancamento"));
				genero = new Genero();
				genero.setId(rs.getInt("f.id_genero"));
				genero.setNome(rs.getString("g.nome"));
				filme.setGenero(genero);
				lista.add(filme);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}*/
		
		return lista;
	}

}
