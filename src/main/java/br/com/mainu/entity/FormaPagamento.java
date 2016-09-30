package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the f_forma_pagamento database table.
 * 
 */
@Entity
@Table(name="f_forma_pagamento")
public class FormaPagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fpagamento_id")
	private int fpagamentoId;

	@Column(name="fpagamento_cartao_bandeira")
	private String fpagamentoCartaoBandeira;

	@Column(name="fpagamento_cartao_codigo")
	private int fpagamentoCartaoCodigo;

	@Column(name="fpagamento_cartao_data_expiracao")
	private String fpagamentoCartaoDataExpiracao;

	@Column(name="fpagamento_cartao_nome")
	private String fpagamentoCartaoNome;

	@Column(name="fpagamento_cartao_numero")
	private String fpagamentoCartaoNumero;

	@Temporal(TemporalType.DATE)
	@Column(name="fpagamento_data_vencimento")
	private Date fpagamentoDataVencimento;

	@Lob
	@Column(name="fpagamento_datas")
	private String fpagamentoDatas;

	@Column(name="fpagamento_forma_pagamento")
	private String fpagamentoFormaPagamento;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	public FormaPagamento() {
	}

	public int getFpagamentoId() {
		return this.fpagamentoId;
	}

	public void setFpagamentoId(int fpagamentoId) {
		this.fpagamentoId = fpagamentoId;
	}

	public String getFpagamentoCartaoBandeira() {
		return this.fpagamentoCartaoBandeira;
	}

	public void setFpagamentoCartaoBandeira(String fpagamentoCartaoBandeira) {
		this.fpagamentoCartaoBandeira = fpagamentoCartaoBandeira;
	}

	public int getFpagamentoCartaoCodigo() {
		return this.fpagamentoCartaoCodigo;
	}

	public void setFpagamentoCartaoCodigo(int fpagamentoCartaoCodigo) {
		this.fpagamentoCartaoCodigo = fpagamentoCartaoCodigo;
	}

	public String getFpagamentoCartaoDataExpiracao() {
		return this.fpagamentoCartaoDataExpiracao;
	}

	public void setFpagamentoCartaoDataExpiracao(String fpagamentoCartaoDataExpiracao) {
		this.fpagamentoCartaoDataExpiracao = fpagamentoCartaoDataExpiracao;
	}

	public String getFpagamentoCartaoNome() {
		return this.fpagamentoCartaoNome;
	}

	public void setFpagamentoCartaoNome(String fpagamentoCartaoNome) {
		this.fpagamentoCartaoNome = fpagamentoCartaoNome;
	}

	public String getFpagamentoCartaoNumero() {
		return this.fpagamentoCartaoNumero;
	}

	public void setFpagamentoCartaoNumero(String fpagamentoCartaoNumero) {
		this.fpagamentoCartaoNumero = fpagamentoCartaoNumero;
	}

	public Date getFpagamentoDataVencimento() {
		return this.fpagamentoDataVencimento;
	}

	public void setFpagamentoDataVencimento(Date fpagamentoDataVencimento) {
		this.fpagamentoDataVencimento = fpagamentoDataVencimento;
	}

	public String getFpagamentoDatas() {
		return this.fpagamentoDatas;
	}

	public void setFpagamentoDatas(String fpagamentoDatas) {
		this.fpagamentoDatas = fpagamentoDatas;
	}

	public String getFpagamentoFormaPagamento() {
		return this.fpagamentoFormaPagamento;
	}

	public void setFpagamentoFormaPagamento(String fpagamentoFormaPagamento) {
		this.fpagamentoFormaPagamento = fpagamentoFormaPagamento;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}