package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the auditoria database table.
 * 
 */
@Entity
@Table(name="auditoria")
@NamedQuery(name="Auditoria.findAll", query="SELECT a FROM Auditoria a")
public class Auditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="auditoria_id")
	private int auditoriaId;

	@Column(name="auditoria_acao")
	private String auditoriaAcao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="auditoria_data")
	private Date auditoriaData;

	@Lob
	@Column(name="auditoria_obs")
	private String auditoriaObs;

	@Lob
	@Column(name="auditoria_texto")
	private String auditoriaTexto;

	@Column(name="usuario_id")
	private int usuarioId;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	public Auditoria() {
	}

	public int getAuditoriaId() {
		return this.auditoriaId;
	}

	public void setAuditoriaId(int auditoriaId) {
		this.auditoriaId = auditoriaId;
	}

	public String getAuditoriaAcao() {
		return this.auditoriaAcao;
	}

	public void setAuditoriaAcao(String auditoriaAcao) {
		this.auditoriaAcao = auditoriaAcao;
	}

	public Date getAuditoriaData() {
		return this.auditoriaData;
	}

	public void setAuditoriaData(Date auditoriaData) {
		this.auditoriaData = auditoriaData;
	}

	public String getAuditoriaObs() {
		return this.auditoriaObs;
	}

	public void setAuditoriaObs(String auditoriaObs) {
		this.auditoriaObs = auditoriaObs;
	}

	public String getAuditoriaTexto() {
		return this.auditoriaTexto;
	}

	public void setAuditoriaTexto(String auditoriaTexto) {
		this.auditoriaTexto = auditoriaTexto;
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}