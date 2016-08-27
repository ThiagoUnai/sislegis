package br.com.sislegis.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sislegis.model.Partido;
import br.com.sislegis.repository.PartidoDAO;

public class PartidoDAOTeste 
{
	@Test
	@Ignore
	public void salvar()
	{
		Partido partido = new Partido();
		PartidoDAO partidoDAO = new PartidoDAO();
		
		partido.setNome("Teste de partido");
		partido.setSigla("TT");
		
		partidoDAO.salvar(partido);
		
	}
	
	@Test
	@Ignore
	public void listar()
	{
		PartidoDAO partidoDAO = new PartidoDAO();
		List<Partido> partidos = partidoDAO.listar();
		
		for(Partido partido : partidos)
		{
			System.out.println(" " +partido.getNome() + " - " + partido.getSigla());
		}
	}
	
	@Test
	@Ignore
	public void buscar()
	{
		Long codigo = 2L;
		PartidoDAO partidoDAO = new PartidoDAO();
		
		Partido partido = partidoDAO.buscar(codigo);
		
		System.out.println("Buscado " + partido.getNome() + " " + partido.getSigla() );
	}
	
	@Test
	@Ignore
	public void atualizar()
	{
		Long codigo = 2L;
		PartidoDAO partidoDAO = new PartidoDAO();
		
		Partido partido = partidoDAO.buscar(codigo);
		
		System.out.println("Antes " +partido.getSigla());
		
		partido.setSigla("AL");
		partidoDAO.atualizar(partido);
		
		System.out.println("Depois " +partido.getSigla());
	}
	
	
	@Test
	@Ignore
	public void excluir()
	{
		Long codigo = 2L;
		PartidoDAO partidoDAO = new PartidoDAO();

		List<Partido> partidos = partidoDAO.listar();
		
		for(Partido partido : partidos)
		{
			System.out.println("Antes " +partido.getNome() + " - " + partido.getSigla());
		}
		
		Partido partido = partidoDAO.buscar(codigo);
		partidoDAO.excluir(partido);
		
	}
}
