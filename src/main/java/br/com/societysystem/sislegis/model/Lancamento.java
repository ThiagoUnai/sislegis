package br.com.societysystem.sislegis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "a10_lancamento_cota_tb")
public class Lancamento implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Column(name = "id_lancamento")
	@Id
	@GeneratedValue
	private Long idLancamento;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date data;
	
	@Column(name = "quantidade_retirada")
	private Short quantidadeRetirada;
	
	@Column(name = "numero_destino", length = 14)
	private String numeroDestino;
	
	@Column(name = "local_ligacao", length = 50)
	private String localLigacao;
	
	@Column(name = "valor_diaria", precision = 6, scale = 2)
	private BigDecimal valorDiaria;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "finalidade_diaria", length = 20)
	private FinalidadeDiariaEnum finalidadeDiaria;
	
	@Column(length = 200)
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "planejamento_id", nullable = false)
	private PlanejamentoCota planejamentoCota;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id", nullable = false)
	private Pessoa pessoa;

	
	
	
	public Long getIdLancamento() {
		return idLancamento;
	}

	public void setIdLancamento(Long idLancamento) {
		this.idLancamento = idLancamento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Short getQuantidadeRetirada() {
		return quantidadeRetirada;
	}

	public void setQuantidadeRetirada(Short quantidadeRetirada) {
		this.quantidadeRetirada = quantidadeRetirada;
	}

	public String getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	public String getLocalLigacao() {
		return localLigacao;
	}

	public void setLocalLigacao(String localLigacao) {
		this.localLigacao = localLigacao;
	}

	public BigDecimal getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(BigDecimal valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public FinalidadeDiariaEnum getFinalidadeDiaria() {
		return finalidadeDiaria;
	}

	public void setFinalidadeDiaria(FinalidadeDiariaEnum finalidadeDiaria) {
		this.finalidadeDiaria = finalidadeDiaria;
	}

	@Basic(fetch = FetchType.LAZY)
	@Lob
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public PlanejamentoCota getPlanejamentoCota() {
		return planejamentoCota;
	}

	public void setPlanejamentoCota(PlanejamentoCota planejamentoCota) {
		this.planejamentoCota = planejamentoCota;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime
				* result
				+ ((finalidadeDiaria == null) ? 0 : finalidadeDiaria.hashCode());
		result = prime * result
				+ ((idLancamento == null) ? 0 : idLancamento.hashCode());
		result = prime * result
				+ ((localLigacao == null) ? 0 : localLigacao.hashCode());
		result = prime * result
				+ ((numeroDestino == null) ? 0 : numeroDestino.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime
				* result
				+ ((planejamentoCota == null) ? 0 : planejamentoCota.hashCode());
		result = prime
				* result
				+ ((quantidadeRetirada == null) ? 0 : quantidadeRetirada
						.hashCode());
		result = prime * result
				+ ((valorDiaria == null) ? 0 : valorDiaria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamento other = (Lancamento) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (finalidadeDiaria != other.finalidadeDiaria)
			return false;
		if (idLancamento == null) {
			if (other.idLancamento != null)
				return false;
		} else if (!idLancamento.equals(other.idLancamento))
			return false;
		if (localLigacao == null) {
			if (other.localLigacao != null)
				return false;
		} else if (!localLigacao.equals(other.localLigacao))
			return false;
		if (numeroDestino == null) {
			if (other.numeroDestino != null)
				return false;
		} else if (!numeroDestino.equals(other.numeroDestino))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (planejamentoCota == null) {
			if (other.planejamentoCota != null)
				return false;
		} else if (!planejamentoCota.equals(other.planejamentoCota))
			return false;
		if (quantidadeRetirada == null) {
			if (other.quantidadeRetirada != null)
				return false;
		} else if (!quantidadeRetirada.equals(other.quantidadeRetirada))
			return false;
		if (valorDiaria == null) {
			if (other.valorDiaria != null)
				return false;
		} else if (!valorDiaria.equals(other.valorDiaria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lancamento [idLancamento=" + idLancamento + ", data=" + data
				+ ", quantidadeRetirada=" + quantidadeRetirada
				+ ", numeroDestino=" + numeroDestino + ", localLigacao="
				+ localLigacao + ", valorDiaria=" + valorDiaria
				+ ", finalidadeDiaria=" + finalidadeDiaria + ", observacao="
				+ observacao + ", planejamentoCota=" + planejamentoCota
				+ ", pessoa=" + pessoa + "]";
	}
}
