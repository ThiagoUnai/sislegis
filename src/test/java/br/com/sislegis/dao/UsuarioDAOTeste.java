package br.com.sislegis.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sislegis.model.Perfil;
import br.com.sislegis.model.Usuario;
import br.com.sislegis.repository.PerfilDAO;
import br.com.sislegis.repository.UsuarioDAO;

public class UsuarioDAOTeste 
{
	
	@Test

	public void salvar()
	{
			Usuario usuario = new Usuario();
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			PerfilDAO perfilDAO = new PerfilDAO();
			Perfil perfil = perfilDAO.buscar(2L);
			
			usuario.setAtivo(true);
			usuario.setEmail("email@email.com");
			usuario.setSenha("senha");
			usuario.setConfirmaSenha("senha");
			usuario.setDataCadastro(new Date());
			
			
			usuarioDAO.salvar(usuario);
		}
		

	@Test
	@Ignore
	public void listar()
	{
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> usuarios = usuarioDAO.listar();
		
		for(Usuario usuario : usuarios)
		{
			//System.out.println("Usuario " +usuario.getEmail() + " Perfil " +usuario.getPerfil().getNome());
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
