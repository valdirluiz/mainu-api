package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categorias database table.
 * 
 */
@Entity
@Table(name="categorias")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="categoria_id")
	private int categoriaId;

	@Column(name="categoria_nome")
	private String categoriaNome;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	//bi-directional many-to-one association to Idioma
	@ManyToOne
	@JoinColumn(name="idioma_id")
	private Idioma idioma;

	//bi-directional many-to-one association to Iten
	@OneToMany(mappedBy="categoria")
	private List<Iten> itens;

	public Categoria() {
	}

	public int getCategoriaId() {
		return this.categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getCategoriaNome() {
		return this.categoriaNome;
	}

	public void setCategoriaNome(String categoriaNome) {
		this.categoriaNome = categoriaNome;
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

	public Iten addIten(Iten iten) {
		getItens().add(iten);
		iten.setCategoria(this);

		return iten;
	}

	public Iten removeIten(Iten iten) {
		getItens().remove(iten);
		iten.setCategoria(null);

		return iten;
	}

}