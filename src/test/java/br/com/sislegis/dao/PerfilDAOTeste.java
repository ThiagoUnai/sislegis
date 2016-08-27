package br.com.sislegis.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sislegis.model.Perfil;
import br.com.sislegis.repository.PerfilDAO;


public class PerfilDAOTeste 
{

	@Test
	@Ignore
	public void salvar()
	{
		Perfil perfil = new Perfil();
		PerfilDAO perfilDAO = new PerfilDAO();
		
		perfil.setNome("Vereador");
		perfil.setDescricao("Grupo apto a manter agendamentos");
		
		perfilDAO.salvar(perfil);
	}
	
	@Test
	@Ignore
	public void listar()
	{
		PerfilDAO perfilDAO = new PerfilDAO();
		List<Perfil> perfis = perfilDAO.listar();
		
		for(Perfil perfil : perfis)
		{
			System.out.println("perfil " +perfil.getNome());
		}
	}
	
	public void buscar()
	{
		
	}
	
	public void atualizar()
	{
		
	}
	
	public void excluir()
	{
		
	}
}
