package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the itens database table.
 * 
 */
@Entity
@Table(name="itens")
@NamedQuery(name="Iten.findAll", query="SELECT i FROM Iten i")
public class Iten implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="item_id")
	private int itemId;

	@Lob
	@Column(name="item_ingredientes")
	private String itemIngredientes;

	@Column(name="item_nome")
	private String itemNome;

	@Column(name="item_unidade_monetaria")
	private String itemUnidadeMonetaria;

	@Column(name="item_valor")
	private double itemValor;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;

	//bi-directional many-to-one association to Cardapio
	@ManyToOne
	@JoinColumn(name="cardapio_id")
	private Cardapio cardapio;

	//bi-directional many-to-many association to Ingrediente
	@ManyToMany
	@JoinTable(
		name="itens_ingredientes"
		, joinColumns={
			@JoinColumn(name="itens_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ingredientes_id")
			}
		)
	private List<Ingrediente> ingredientes;

	public Iten() {
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemIngredientes() {
		return this.itemIngredientes;
	}

	public void setItemIngredientes(String itemIngredientes) {
		this.itemIngredientes = itemIngredientes;
	}

	public String getItemNome() {
		return this.itemNome;
	}

	public void setItemNome(String itemNome) {
		this.itemNome = itemNome;
	}

	public String getItemUnidadeMonetaria() {
		return this.itemUnidadeMonetaria;
	}

	public void setItemUnidadeMonetaria(String itemUnidadeMonetaria) {
		this.itemUnidadeMonetaria = itemUnidadeMonetaria;
	}

	public double getItemValor() {
		return this.itemValor;
	}

	public void setItemValor(double itemValor) {
		this.itemValor = itemValor;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Cardapio getCardapio() {
		return this.cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public List<Ingrediente> getIngredientes() {
		return this.ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

}