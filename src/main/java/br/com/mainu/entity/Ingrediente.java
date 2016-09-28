package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ingredientes database table.
 * 
 */
@Entity
@Table(name="ingredientes")
@NamedQuery(name="Ingrediente.findAll", query="SELECT i FROM Ingrediente i")
public class Ingrediente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ingrediente_id")
	private int ingredienteId;

	@Column(name="ingrediente_nome")
	private String ingredienteNome;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimentos_id")
	private Estabelecimento estabelecimento;

	//bi-directional many-to-one association to Idioma
	@ManyToOne
	@JoinColumn(name="idiomas_id")
	private Idioma idioma;

	//bi-directional many-to-many association to Iten
	@ManyToMany(mappedBy="ingredientes")
	private List<Iten> itens;

	public Ingrediente() {
	}

	public int getIngredienteId() {
		return this.ingredienteId;
	}

	public void setIngredienteId(int ingredienteId) {
		this.ingredienteId = ingredienteId;
	}

	public String getIngredienteNome() {
		return this.ingredienteNome;
	}

	public void setIngredienteNome(String ingredienteNome) {
		this.ingredienteNome = ingredienteNome;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Idioma getIdioma() {
		return this.idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public List<Iten> getItens() {
		return this.itens;
	}

	public void setItens(List<Iten> itens) {
		this.itens = itens;
	}

}