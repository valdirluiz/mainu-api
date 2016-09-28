package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the niveis database table.
 * 
 */
@Entity
@Table(name="niveis")
@NamedQuery(name="Nivei.findAll", query="SELECT n FROM Nivei n")
public class Nivei implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nivel_id")
	private int nivelId;

	@Column(name="nivel_nome")
	private String nivelNome;

	@Column(name="nivel_status")
	private int nivelStatus;

	//bi-directional many-to-one association to Permissoe
	@OneToMany(mappedBy="nivei")
	private List<Permissoe> permissoes;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="nivei")
	private List<Usuario> usuarios;

	public Nivei() {
	}

	public int getNivelId() {
		return this.nivelId;
	}

	public void setNivelId(int nivelId) {
		this.nivelId = nivelId;
	}

	public String getNivelNome() {
		return this.nivelNome;
	}

	public void setNivelNome(String nivelNome) {
		this.nivelNome = nivelNome;
	}

	public int getNivelStatus() {
		return this.nivelStatus;
	}

	public void setNivelStatus(int nivelStatus) {
		this.nivelStatus = nivelStatus;
	}

	public List<Permissoe> getPermissoes() {
		return this.permissoes;
	}

	public void setPermissoes(List<Permissoe> permissoes) {
		this.permissoes = permissoes;
	}

	public Permissoe addPermissoe(Permissoe permissoe) {
		getPermissoes().add(permissoe);
		permissoe.setNivei(this);

		return permissoe;
	}

	public Permissoe removePermissoe(Permissoe permissoe) {
		getPermissoes().remove(permissoe);
		permissoe.setNivei(null);

		return permissoe;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setNivei(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setNivei(null);

		return usuario;
	}

}