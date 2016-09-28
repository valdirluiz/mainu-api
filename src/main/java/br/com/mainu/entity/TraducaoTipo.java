package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the traducao_tipo database table.
 * 
 */
@Entity
@Table(name="traducao_tipo")
@NamedQuery(name="TraducaoTipo.findAll", query="SELECT t FROM TraducaoTipo t")
public class TraducaoTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tipo_id")
	private int tipoId;

	@Column(name="tipo_nome")
	private String tipoNome;

	public TraducaoTipo() {
	}

	public int getTipoId() {
		return this.tipoId;
	}

	public void setTipoId(int tipoId) {
		this.tipoId = tipoId;
	}

	public String getTipoNome() {
		return this.tipoNome;
	}

	public void setTipoNome(String tipoNome) {
		this.tipoNome = tipoNome;
	}

}