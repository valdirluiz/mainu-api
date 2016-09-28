package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the f_cobrancas database table.
 * 
 */
@Entity
@Table(name="f_cobrancas")
@NamedQuery(name="FCobranca.findAll", query="SELECT f FROM FCobranca f")
public class Cobranca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cobranca_id")
	private int cobrancaId;

	@Temporal(TemporalType.DATE)
	@Column(name="cartao_data_cadastro")
	private Date cartaoDataCadastro;

	@Column(name="cobranca_cartao_bandeira")
	private String cobrancaCartaoBandeira;

	@Column(name="cobranca_cartao_codigo")
	private int cobrancaCartaoCodigo;

	@Column(name="cobranca_cartao_data_expiracao")
	private String cobrancaCartaoDataExpiracao;

	@Column(name="cobranca_cartao_nome")
	private String cobrancaCartaoNome;

	@Column(name="cobranca_cartao_numero")
	private String cobrancaCartaoNumero;

	@Temporal(TemporalType.DATE)
	@Column(name="cobranca_data_vencimento")
	private Date cobrancaDataVencimento;

	@Lob
	@Column(name="cobranca_descricao_valores")
	private String cobrancaDescricaoValores;

	@Column(name="cobranca_forma_pagamento")
	private String cobrancaFormaPagamento;

	@Column(name="cobranca_payment_token")
	private String cobrancaPaymentToken;

	@Column(name="cobranca_status")
	private int cobrancaStatus;

	@Column(name="cobranca_transacao")
	private int cobrancaTransacao;

	@Column(name="cobranca_valor")
	private double cobrancaValor;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	public Cobranca() {
	}

	public int getCobrancaId() {
		return this.cobrancaId;
	}

	public void setCobrancaId(int cobrancaId) {
		this.cobrancaId = cobrancaId;
	}

	public Date getCartaoDataCadastro() {
		return this.cartaoDataCadastro;
	}

	public void setCartaoDataCadastro(Date cartaoDataCadastro) {
		this.cartaoDataCadastro = cartaoDataCadastro;
	}

	public String getCobrancaCartaoBandeira() {
		return this.cobrancaCartaoBandeira;
	}

	public void setCobrancaCartaoBandeira(String cobrancaCartaoBandeira) {
		this.cobrancaCartaoBandeira = cobrancaCartaoBandeira;
	}

	public int getCobrancaCartaoCodigo() {
		return this.cobrancaCartaoCodigo;
	}

	public void setCobrancaCartaoCodigo(int cobrancaCartaoCodigo) {
		this.cobrancaCartaoCodigo = cobrancaCartaoCodigo;
	}

	public String getCobrancaCartaoDataExpiracao() {
		return this.cobrancaCartaoDataExpiracao;
	}

	public void setCobrancaCartaoDataExpiracao(String cobrancaCartaoDataExpiracao) {
		this.cobrancaCartaoDataExpiracao = cobrancaCartaoDataExpiracao;
	}

	public String getCobrancaCartaoNome() {
		return this.cobrancaCartaoNome;
	}

	public void setCobrancaCartaoNome(String cobrancaCartaoNome) {
		this.cobrancaCartaoNome = cobrancaCartaoNome;
	}

	public String getCobrancaCartaoNumero() {
		return this.cobrancaCartaoNumero;
	}

	public void setCobrancaCartaoNumero(String cobrancaCartaoNumero) {
		this.cobrancaCartaoNumero = cobrancaCartaoNumero;
	}

	public Date getCobrancaDataVencimento() {
		return this.cobrancaDataVencimento;
	}

	public void setCobrancaDataVencimento(Date cobrancaDataVencimento) {
		this.cobrancaDataVencimento = cobrancaDataVencimento;
	}

	public String getCobrancaDescricaoValores() {
		return this.cobrancaDescricaoValores;
	}

	public void setCobrancaDescricaoValores(String cobrancaDescricaoValores) {
		this.cobrancaDescricaoValores = cobrancaDescricaoValores;
	}

	public String getCobrancaFormaPagamento() {
		return this.cobrancaFormaPagamento;
	}

	public void setCobrancaFormaPagamento(String cobrancaFormaPagamento) {
		this.cobrancaFormaPagamento = cobrancaFormaPagamento;
	}

	public String getCobrancaPaymentToken() {
		return this.cobrancaPaymentToken;
	}

	public void setCobrancaPaymentToken(String cobrancaPaymentToken) {
		this.cobrancaPaymentToken = cobrancaPaymentToken;
	}

	public int getCobrancaStatus() {
		return this.cobrancaStatus;
	}

	public void setCobrancaStatus(int cobrancaStatus) {
		this.cobrancaStatus = cobrancaStatus;
	}

	public int getCobrancaTransacao() {
		return this.cobrancaTransacao;
	}

	public void setCobrancaTransacao(int cobrancaTransacao) {
		this.cobrancaTransacao = cobrancaTransacao;
	}

	public double getCobrancaValor() {
		return this.cobrancaValor;
	}

	public void setCobrancaValor(double cobrancaValor) {
		this.cobrancaValor = cobrancaValor;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}