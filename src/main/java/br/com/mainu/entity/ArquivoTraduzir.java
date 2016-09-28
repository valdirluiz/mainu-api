package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the arquivo_traduzir database table.
 * 
 */
@Entity
@Table(name="arquivo_traduzir")
@NamedQuery(name="ArquivoTraduzir.findAll", query="SELECT a FROM ArquivoTraduzir a")
public class ArquivoTraduzir implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="arquivo_id")
	private int arquivoId;

	@Column(name="arquivo_nome")
	private String arquivoNome;

	@Column(name="usuario_id")
	private int usuarioId;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	public ArquivoTraduzir() {
	}

	public int getArquivoId() {
		return this.arquivoId;
	}

	public void setArquivoId(int arquivoId) {
		this.arquivoId = arquivoId;
	}

	public String getArquivoNome() {
		return this.arquivoNome;
	}

	public void setArquivoNome(String arquivoNome) {
		this.arquivoNome = arquivoNome;
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}