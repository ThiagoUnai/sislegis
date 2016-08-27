package br.com.sislegis.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sislegis.model.Endereco;
import br.com.sislegis.model.GeneroEnum;
import br.com.sislegis.model.Municipio;
import br.com.sislegis.model.Pessoa;
import br.com.sislegis.repository.MunicipioDAO;
import br.com.sislegis.repository.PessoaDAO;


public class PessoaDAOTeste 
{
	
	@Test
	@Ignore
	public void salvar()
	{
		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoaDAO = new PessoaDAO();	
		MunicipioDAO municipioDAO = new MunicipioDAO();
		Municipio m = municipioDAO.buscar(1L);
		
		Endereco end = new Endereco();
		
		end.setBairro("dddd");
		end.setComplemento("sss");
		end.setLogradouro("333");
		end.setNumero((short) 55);
		end.setMunicipio(m);
		
		
		pessoa.setNome("Matheus");
		pessoa.setSobrenome("Mendes");
		pessoa.setTelefone("8888888");
		pessoa.setGenero(GeneroEnum.MASCULINO);
		pessoa.setEndereco(end);
		
		pessoaDAO.salvar(pessoa);
		
	}
	
	
	@Test
	@Ignore
	public void buscar()
	{
		PessoaDAO pessoaDAO = new PessoaDAO();	
		Pessoa pessoa = pessoaDAO.buscar(1L);
		
		System.out.println("Pessoa selecionada p/ manipulação: " +pessoa.getNome() + "Sobrenome: " +pessoa.getSobrenome());
	}
	
	
	@Test
	public void atualizar()
	{
		PessoaDAO pessoaDAO = new PessoaDAO();	
		Pessoa pessoa = pessoaDAO.buscar(1L);
		
		System.out.println("Pessoa selecionada p/ manipulação: " +pessoa.getNome() + "Sobrenome: " +pessoa.getSobrenome());
	
		pessoa.setNome("Juliana");
		pessoa.setSobrenome("testando");
		
		pessoaDAO.atualizar(pessoa);
		System.out.println("Pessoa após atualização: " +pessoa.getNome() + "Sobrenome: " +pessoa.getSobrenome());
	}
	
}
