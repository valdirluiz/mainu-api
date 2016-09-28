package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the metodos database table.
 * 
 */
@Entity
@Table(name="metodos")
@NamedQuery(name="Metodo.findAll", query="SELECT m FROM Metodo m")
public class Metodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String classe;

	private String identificacao;

	private String metodo;

	private byte privado;

	//bi-directional many-to-one association to Permissoe
	@OneToMany(mappedBy="metodo")
	private List<Permissoe> permissoes;

	public Metodo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClasse() {
		return this.classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getIdentificacao() {
		return this.identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getMetodo() {
		return this.metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public byte getPrivado() {
		return this.privado;
	}

	public void setPrivado(byte privado) {
		this.privado = privado;
	}

	public List<Permissoe> getPermissoes() {
		return this.permissoes;
	}

	public void setPermissoes(List<Permissoe> permissoes) {
		this.permissoes = permissoes;
	}

	public Permissoe addPermissoe(Permissoe permissoe) {
		getPermissoes().add(permissoe);
		permissoe.setMetodo(this);

		return permissoe;
	}

	public Permissoe removePermissoe(Permissoe permissoe) {
		getPermissoes().remove(permissoe);
		permissoe.setMetodo(null);

		return permissoe;
	}

}