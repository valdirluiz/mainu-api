package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the planos database table.
 * 
 */
@Entity
@Table(name="planos")
@NamedQuery(name="Plano.findAll", query="SELECT p FROM Plano p")
public class Plano implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="plano_id")
	private int planoId;

	@Lob
	@Column(name="plano_descricao")
	private String planoDescricao;

	@Column(name="plano_nome")
	private String planoNome;

	@Column(name="plano_pagamento")
	private String planoPagamento;

	@Column(name="plano_palavras")
	private int planoPalavras;

	@Column(name="plano_qtd_usuario")
	private int planoQtdUsuario;

	@Column(name="plano_status")
	private int planoStatus;

	@Column(name="plano_taxa_adesao")
	private double planoTaxaAdesao;

	@Column(name="plano_taxa_txt")
	private String planoTaxaTxt;

	@Column(name="plano_valor")
	private double planoValor;

	//bi-directional many-to-one association to Estabelecimento
	@OneToMany(mappedBy="plano")
	private List<Estabelecimento> estabelecimentos;

	public Plano() {
	}

	public int getPlanoId() {
		return this.planoId;
	}

	public void setPlanoId(int planoId) {
		this.planoId = planoId;
	}

	public String getPlanoDescricao() {
		return this.planoDescricao;
	}

	public void setPlanoDescricao(String planoDescricao) {
		this.planoDescricao = planoDescricao;
	}

	public String getPlanoNome() {
		return this.planoNome;
	}

	public void setPlanoNome(String planoNome) {
		this.planoNome = planoNome;
	}

	public String getPlanoPagamento() {
		return this.planoPagamento;
	}

	public void setPlanoPagamento(String planoPagamento) {
		this.planoPagamento = planoPagamento;
	}

	public int getPlanoPalavras() {
		return this.planoPalavras;
	}

	public void setPlanoPalavras(int planoPalavras) {
		this.planoPalavras = planoPalavras;
	}

	public int getPlanoQtdUsuario() {
		return this.planoQtdUsuario;
	}

	public void setPlanoQtdUsuario(int planoQtdUsuario) {
		this.planoQtdUsuario = planoQtdUsuario;
	}

	public int getPlanoStatus() {
		return this.planoStatus;
	}

	public void setPlanoStatus(int planoStatus) {
		this.planoStatus = planoStatus;
	}

	public double getPlanoTaxaAdesao() {
		return this.planoTaxaAdesao;
	}

	public void setPlanoTaxaAdesao(double planoTaxaAdesao) {
		this.planoTaxaAdesao = planoTaxaAdesao;
	}

	public String getPlanoTaxaTxt() {
		return this.planoTaxaTxt;
	}

	public void setPlanoTaxaTxt(String planoTaxaTxt) {
		this.planoTaxaTxt = planoTaxaTxt;
	}

	public double getPlanoValor() {
		return this.planoValor;
	}

	public void setPlanoValor(double planoValor) {
		this.planoValor = planoValor;
	}

	public List<Estabelecimento> getEstabelecimentos() {
		return this.estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

	public Estabelecimento addEstabelecimento(Estabelecimento estabelecimento) {
		getEstabelecimentos().add(estabelecimento);
		estabelecimento.setPlano(this);

		return estabelecimento;
	}

	public Estabelecimento removeEstabelecimento(Estabelecimento estabelecimento) {
		getEstabelecimentos().remove(estabelecimento);
		estabelecimento.setPlano(null);

		return estabelecimento;
	}

}