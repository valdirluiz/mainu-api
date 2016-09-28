package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the permissoes database table.
 * 
 */
@Entity
@Table(name="permissoes")
@NamedQuery(name="Permissoe.findAll", query="SELECT p FROM Permissoe p")
public class Permissoe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to Metodo
	@ManyToOne
	@JoinColumn(name="id_metodo")
	private Metodo metodo;

	//bi-directional many-to-one association to Nivei
	@ManyToOne
	@JoinColumn(name="id_nivel")
	private Nivei nivei;

	public Permissoe() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Metodo getMetodo() {
		return this.metodo;
	}

	public void setMetodo(Metodo metodo) {
		this.metodo = metodo;
	}

	public Nivei getNivei() {
		return this.nivei;
	}

	public void setNivei(Nivei nivei) {
		this.nivei = nivei;
	}

}