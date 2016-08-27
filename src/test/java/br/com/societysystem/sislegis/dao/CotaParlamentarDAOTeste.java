package br.com.societysystem.sislegis.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.societysystem.sislegis.model.CotaParlamentar;
import br.com.societysystem.sislegis.repository.CotaParlamentarDAO;

public class CotaParlamentarDAOTeste
{

	@Test
	@Ignore
	public void salvar()
	{
		CotaParlamentar cota = new CotaParlamentar();
		CotaParlamentarDAO dao = new CotaParlamentarDAO();
		
		cota.setNome("teste");
		cota.setDescricao("testando");
		
		
		dao.salvar(cota);
	}
}
