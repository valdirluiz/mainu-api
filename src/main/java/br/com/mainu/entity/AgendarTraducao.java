package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the agendar_traducao database table.
 * 
 */
@Entity
@Table(name="agendar_traducao")
@NamedQuery(name="AgendarTraducao.findAll", query="SELECT a FROM AgendarTraducao a")
public class AgendarTraducao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="agenda_id")
	private int agendaId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="agenda_data_cadastro")
	private Date agendaDataCadastro;

	@Column(name="agenda_de")
	private String agendaDe;

	@Column(name="agenda_para")
	private String agendaPara;

	@Column(name="agenda_status")
	private int agendaStatus;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	//bi-directional many-to-one association to Tradutore
	@ManyToOne
	@JoinColumn(name="tradutor_id")
	private Tradutore tradutore;

	public AgendarTraducao() {
	}

	public int getAgendaId() {
		return this.agendaId;
	}

	public void setAgendaId(int agendaId) {
		this.agendaId = agendaId;
	}

	public Date getAgendaDataCadastro() {
		return this.agendaDataCadastro;
	}

	public void setAgendaDataCadastro(Date agendaDataCadastro) {
		this.agendaDataCadastro = agendaDataCadastro;
	}

	public String getAgendaDe() {
		return this.agendaDe;
	}

	public void setAgendaDe(String agendaDe) {
		this.agendaDe = agendaDe;
	}

	public String getAgendaPara() {
		return this.agendaPara;
	}

	public void setAgendaPara(String agendaPara) {
		this.agendaPara = agendaPara;
	}

	public int getAgendaStatus() {
		return this.agendaStatus;
	}

	public void setAgendaStatus(int agendaStatus) {
		this.agendaStatus = agendaStatus;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Tradutore getTradutore() {
		return this.tradutore;
	}

	public void setTradutore(Tradutore tradutore) {
		this.tradutore = tradutore;
	}

}