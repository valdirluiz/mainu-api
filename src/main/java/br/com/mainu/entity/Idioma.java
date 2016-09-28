package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the idiomas database table.
 * 
 */
@Entity
@Table(name="idiomas")
@NamedQuery(name="Idioma.findAll", query="SELECT i FROM Idioma i")
public class Idioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idioma_id")
	private int idiomaId;

	@Column(name="idioma_fl_liberado")
	private byte idiomaFlLiberado;

	@Column(name="idioma_nome")
	private String idiomaNome;

	@Column(name="idioma_sigla_bandeira")
	private String idiomaSiglaBandeira;

	//bi-directional many-to-one association to Cardapio
	@OneToMany(mappedBy="idioma")
	private List<Cardapio> cardapios;

	//bi-directional many-to-one association to Categoria
	@OneToMany(mappedBy="idioma")
	private List<Categoria> categorias;

	//bi-directional many-to-one association to Ingrediente
	@OneToMany(mappedBy="idioma")
	private List<Ingrediente> ingredientes;

	//bi-directional many-to-one association to ViewsIdioma
	@OneToMany(mappedBy="idioma")
	private List<ViewsIdioma> viewsIdiomas;

	public Idioma() {
	}

	public int getIdiomaId() {
		return this.idiomaId;
	}

	public void setIdiomaId(int idiomaId) {
		this.idiomaId = idiomaId;
	}

	public byte getIdiomaFlLiberado() {
		return this.idiomaFlLiberado;
	}

	public void setIdiomaFlLiberado(byte idiomaFlLiberado) {
		this.idiomaFlLiberado = idiomaFlLiberado;
	}

	public String getIdiomaNome() {
		return this.idiomaNome;
	}

	public void setIdiomaNome(String idiomaNome) {
		this.idiomaNome = idiomaNome;
	}

	public String getIdiomaSiglaBandeira() {
		return this.idiomaSiglaBandeira;
	}

	public void setIdiomaSiglaBandeira(String idiomaSiglaBandeira) {
		this.idiomaSiglaBandeira = idiomaSiglaBandeira;
	}

	public List<Cardapio> getCardapios() {
		return this.cardapios;
	}

	public void setCardapios(List<Cardapio> cardapios) {
		this.cardapios = cardapios;
	}

	public Cardapio addCardapio(Cardapio cardapio) {
		getCardapios().add(cardapio);
		cardapio.setIdioma(this);

		return cardapio;
	}

	public Cardapio removeCardapio(Cardapio cardapio) {
		getCardapios().remove(cardapio);
		cardapio.setIdioma(null);

		return cardapio;
	}

	public List<Categoria> getCategorias() {
		return this.categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Categoria addCategoria(Categoria categoria) {
		getCategorias().add(categoria);
		categoria.setIdioma(this);

		return categoria;
	}

	public Categoria removeCategoria(Categoria categoria) {
		getCategorias().remove(categoria);
		categoria.setIdioma(null);

		return categoria;
	}

	public List<Ingrediente> getIngredientes() {
		return this.ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Ingrediente addIngrediente(Ingrediente ingrediente) {
		getIngredientes().add(ingrediente);
		ingrediente.setIdioma(this);

		return ingrediente;
	}

	public Ingrediente removeIngrediente(Ingrediente ingrediente) {
		getIngredientes().remove(ingrediente);
		ingrediente.setIdioma(null);

		return ingrediente;
	}

	public List<ViewsIdioma> getViewsIdiomas() {
		return this.viewsIdiomas;
	}

	public void setViewsIdiomas(List<ViewsIdioma> viewsIdiomas) {
		this.viewsIdiomas = viewsIdiomas;
	}

	public ViewsIdioma addViewsIdioma(ViewsIdioma viewsIdioma) {
		getViewsIdiomas().add(viewsIdioma);
		viewsIdioma.setIdioma(this);

		return viewsIdioma;
	}

	public ViewsIdioma removeViewsIdioma(ViewsIdioma viewsIdioma) {
		getViewsIdiomas().remove(viewsIdioma);
		viewsIdioma.setIdioma(null);

		return viewsIdioma;
	}

}