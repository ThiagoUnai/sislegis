package br.com.sislegis.controller;
import java.util.List;
import javax.faces.bean.ManagedBean;
import br.com.sislegis.model.Lancamento;
import br.com.sislegis.model.Pessoa;
import br.com.sislegis.model.PlanejamentoCota;
import br.com.sislegis.repository.LancamentoDAO;
import br.com.sislegis.repository.PessoaDAO;
import br.com.sislegis.repository.PlanejamentoCotaDAO;

@ManagedBean
public class LancamentoController 
{
	LancamentoDAO lancamentoDAO = new LancamentoDAO();
	PlanejamentoCotaDAO planejamentoDAO = new PlanejamentoCotaDAO();
	PessoaDAO pessoaDAO = new PessoaDAO();
	
	private Lancamento lancamento;
	private List<Lancamento> lancamentos;
	private List<PlanejamentoCota> planejamentos;
	private List<Pessoa> pessoas;
	
	
	public LancamentoController()
	{
		lancamento = new Lancamento();
		planejamentos = planejamentoDAO.listar();
		pessoas = pessoaDAO.listar();
	}
	
	
	public void inicializar()
	{
		lancamento = new Lancamento();
	}
	
	
	public void salvar()
	{
		
	}
	
	
	
	public Lancamento getLancamento() {
		return lancamento;
	}
	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
	public List<PlanejamentoCota> getPlanejamentos() {
		return planejamentos;
	}
	public void setPlanejamentos(List<PlanejamentoCota> planejamentos) {
		this.planejamentos = planejamentos;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}
