package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the configuracao database table.
 * 
 */
@Entity
@Table(name="configuracao")
@NamedQuery(name="Configuracao.findAll", query="SELECT c FROM Configuracao c")
public class Configuracao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="configuracao_id")
	private int configuracaoId;

	@Lob
	@Column(name="configuracao_config")
	private String configuracaoConfig;

	@Lob
	@Column(name="configuracao_config_json")
	private String configuracaoConfigJson;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	public Configuracao() {
	}

	public int getConfiguracaoId() {
		return this.configuracaoId;
	}

	public void setConfiguracaoId(int configuracaoId) {
		this.configuracaoId = configuracaoId;
	}

	public String getConfiguracaoConfig() {
		return this.configuracaoConfig;
	}

	public void setConfiguracaoConfig(String configuracaoConfig) {
		this.configuracaoConfig = configuracaoConfig;
	}

	public String getConfiguracaoConfigJson() {
		return this.configuracaoConfigJson;
	}

	public void setConfiguracaoConfigJson(String configuracaoConfigJson) {
		this.configuracaoConfigJson = configuracaoConfigJson;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}