package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the palavras database table.
 * 
 */
@Entity
@Table(name="palavras")
@NamedQuery(name="Palavra.findAll", query="SELECT p FROM Palavra p")
public class Palavra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="palavra_id")
	private int palavraId;

	@Column(name="palavra_count")
	private int palavraCount;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	public Palavra() {
	}

	public int getPalavraId() {
		return this.palavraId;
	}

	public void setPalavraId(int palavraId) {
		this.palavraId = palavraId;
	}

	public int getPalavraCount() {
		return this.palavraCount;
	}

	public void setPalavraCount(int palavraCount) {
		this.palavraCount = palavraCount;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}