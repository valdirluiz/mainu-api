package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tradutores database table.
 * 
 */
@Entity
@Table(name="tradutores")
@NamedQuery(name="Tradutore.findAll", query="SELECT t FROM Tradutore t")
public class Tradutore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tradutor_id")
	private int tradutorId;

	@Column(name="tradutor_nome")
	private String tradutorNome;

	@Column(name="tradutor_status")
	private int tradutorStatus;

	//bi-directional many-to-one association to AgendarTraducao
	@OneToMany(mappedBy="tradutore")
	private List<AgendarTraducao> agendarTraducaos;

	public Tradutore() {
	}

	public int getTradutorId() {
		return this.tradutorId;
	}

	public void setTradutorId(int tradutorId) {
		this.tradutorId = tradutorId;
	}

	public String getTradutorNome() {
		return this.tradutorNome;
	}

	public void setTradutorNome(String tradutorNome) {
		this.tradutorNome = tradutorNome;
	}

	public int getTradutorStatus() {
		return this.tradutorStatus;
	}

	public void setTradutorStatus(int tradutorStatus) {
		this.tradutorStatus = tradutorStatus;
	}

	public List<AgendarTraducao> getAgendarTraducaos() {
		return this.agendarTraducaos;
	}

	public void setAgendarTraducaos(List<AgendarTraducao> agendarTraducaos) {
		this.agendarTraducaos = agendarTraducaos;
	}

	public AgendarTraducao addAgendarTraducao(AgendarTraducao agendarTraducao) {
		getAgendarTraducaos().add(agendarTraducao);
		agendarTraducao.setTradutore(this);

		return agendarTraducao;
	}

	public AgendarTraducao removeAgendarTraducao(AgendarTraducao agendarTraducao) {
		getAgendarTraducaos().remove(agendarTraducao);
		agendarTraducao.setTradutore(null);

		return agendarTraducao;
	}

}