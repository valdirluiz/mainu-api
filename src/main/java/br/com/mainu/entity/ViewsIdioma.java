package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the views_idiomas database table.
 * 
 */
@Entity
@Table(name="views_idiomas")
@NamedQuery(name="ViewsIdioma.findAll", query="SELECT v FROM ViewsIdioma v")
public class ViewsIdioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="views_id")
	private int viewsId;

	@Column(name="views_count")
	private int viewsCount;

	@Temporal(TemporalType.DATE)
	@Column(name="views_data")
	private Date viewsData;

	//bi-directional many-to-one association to Idioma
	@ManyToOne
	@JoinColumn(name="idiomas_idioma_id")
	private Idioma idioma;

	public ViewsIdioma() {
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

	public Idioma getIdioma() {
		return this.idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

}