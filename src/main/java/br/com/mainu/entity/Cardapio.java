package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cardapios database table.
 * 
 */
@Entity
@Table(name="cardapios")
@NamedQuery(name="Cardapio.findAll", query="SELECT c FROM Cardapio c")
public class Cardapio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cardapio_id")
	private int cardapioId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cardapio_data_atualizacao")
	private Date cardapioDataAtualizacao;

	@Column(name="cardapio_descricao")
	private String cardapioDescricao;

	@Column(name="cardapio_fl_ativado")
	private byte cardapioFlAtivado;

	@Column(name="cardapio_fl_principal")
	private byte cardapioFlPrincipal;

	//bi-directional many-to-one association to Idioma
	@ManyToOne
	@JoinColumn(name="idioma_id")
	private Idioma idioma;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	//bi-directional many-to-one association to Iten
	@OneToMany(mappedBy="cardapio")
	private List<Iten> itens;

	public Cardapio() {
	}

	public int getCardapioId() {
		return this.cardapioId;
	}

	public void setCardapioId(int cardapioId) {
		this.cardapioId = cardapioId;
	}

	public Date getCardapioDataAtualizacao() {
		return this.cardapioDataAtualizacao;
	}

	public void setCardapioDataAtualizacao(Date cardapioDataAtualizacao) {
		this.cardapioDataAtualizacao = cardapioDataAtualizacao;
	}

	public String getCardapioDescricao() {
		return this.cardapioDescricao;
	}

	public void setCardapioDescricao(String cardapioDescricao) {
		this.cardapioDescricao = cardapioDescricao;
	}

	public byte getCardapioFlAtivado() {
		return this.cardapioFlAtivado;
	}

	public void setCardapioFlAtivado(byte cardapioFlAtivado) {
		this.cardapioFlAtivado = cardapioFlAtivado;
	}

	public byte getCardapioFlPrincipal() {
		return this.cardapioFlPrincipal;
	}

	public void setCardapioFlPrincipal(byte cardapioFlPrincipal) {
		this.cardapioFlPrincipal = cardapioFlPrincipal;
	}

	public Idioma getIdioma() {
		return this.idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public List<Iten> getItens() {
		return this.itens;
	}

	public void setItens(List<Iten> itens) {
		this.itens = itens;
	}

	public Iten addIten(Iten iten) {
		getItens().add(iten);
		iten.setCardapio(this);

		return iten;
	}

	public Iten removeIten(Iten iten) {
		getItens().remove(iten);
		iten.setCardapio(null);

		return iten;
	}

}