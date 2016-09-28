package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the views_estabelecimentos database table.
 * 
 */
@Entity
@Table(name="views_estabelecimentos")
@NamedQuery(name="ViewsEstabelecimento.findAll", query="SELECT v FROM ViewsEstabelecimento v")
public class ViewsEstabelecimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="views_id")
	private int viewsId;

	@Column(name="views_count")
	private int viewsCount;

	@Temporal(TemporalType.DATE)
	@Column(name="views_data")
	private Date viewsData;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	public ViewsEstabelecimento() {
	}

	public int getViewsId() {
		return this.viewsId;
	}

	public void setViewsId(int viewsId) {
		this.viewsId = viewsId;
	}

	public int getViewsCount() {
		return this.viewsCount;
	}

	public void setViewsCount(int viewsCount) {
		this.viewsCount = viewsCount;
	}

	public Date getViewsData() {
		return this.viewsData;
	}

	public void setViewsData(Date viewsData) {
		this.viewsData = viewsData;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}