package br.com.sislegis.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sislegis.model.CotaParlamentar;
import br.com.sislegis.repository.CotaParlamentarDAO;

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
