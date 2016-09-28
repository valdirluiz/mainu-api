package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="usuario_id")
	private int usuarioId;

	@Column(name="usuario_chave")
	private String usuarioChave;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="usuario_data_atualizacao")
	private Date usuarioDataAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="usuario_data_cadastro")
	private Date usuarioDataCadastro;

	@Column(name="usuario_email")
	private String usuarioEmail;

	@Column(name="usuario_nome")
	private String usuarioNome;

	@Column(name="usuario_senha")
	private String usuarioSenha;

	@Column(name="usuario_status")
	private int usuarioStatus;

	//bi-directional many-to-one association to Estabelecimento
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;

	//bi-directional many-to-one association to Nivei
	@ManyToOne
	@JoinColumn(name="niveis_nivel_id")
	private Nivei nivei;

	public Usuario() {
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioChave() {
		return this.usuarioChave;
	}

	public void setUsuarioChave(String usuarioChave) {
		this.usuarioChave = usuarioChave;
	}

	public Date getUsuarioDataAtualizacao() {
		return this.usuarioDataAtualizacao;
	}

	public void setUsuarioDataAtualizacao(Date usuarioDataAtualizacao) {
		this.usuarioDataAtualizacao = usuarioDataAtualizacao;
	}

	public Date getUsuarioDataCadastro() {
		return this.usuarioDataCadastro;
	}

	public void setUsuarioDataCadastro(Date usuarioDataCadastro) {
		this.usuarioDataCadastro = usuarioDataCadastro;
	}

	public String getUsuarioEmail() {
		return this.usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	public String getUsuarioNome() {
		return this.usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public String getUsuarioSenha() {
		return this.usuarioSenha;
	}

	public void setUsuarioSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}

	public int getUsuarioStatus() {
		return this.usuarioStatus;
	}

	public void setUsuarioStatus(int usuarioStatus) {
		this.usuarioStatus = usuarioStatus;
	}

	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Nivei getNivei() {
		return this.nivei;
	}

	public void setNivei(Nivei nivei) {
		this.nivei = nivei;
	}

}