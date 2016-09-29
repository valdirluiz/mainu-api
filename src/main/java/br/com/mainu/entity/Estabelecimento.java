package br.com.mainu.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.querydsl.core.annotations.QueryProjection;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the estabelecimentos database table.
 * 
 */
@Entity
@Table(name="estabelecimentos")
@NamedQuery(name="Estabelecimento.findAll", query="SELECT e FROM Estabelecimento e")
public class Estabelecimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="estabelecimento_id")
	private int estabelecimentoId;

	@Column(name="estabelecimento_bairro")
	private String estabelecimentoBairro;

	@Column(name="estabelecimento_cep")
	private int estabelecimentoCep;

	@Column(name="estabelecimento_chave")
	private String estabelecimentoChave;

	@Column(name="estabelecimento_cidade")
	private String estabelecimentoCidade;

	@Column(name="estabelecimento_codigo")
	private String estabelecimentoCodigo;

	@Column(name="estabelecimento_complemento")
	private String estabelecimentoComplemento;

	@Column(name="estabelecimento_data_atualizacao")
	private int estabelecimentoDataAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="estabelecimento_data_cadastro")
	private Date estabelecimentoDataCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="estabelecimento_data_cadastro_pre")
	private Date estabelecimentoDataCadastroPre;

	@Lob
	@Column(name="estabelecimento_descricao")
	private String estabelecimentoDescricao;

	@Column(name="estabelecimento_doc")
	private String estabelecimentoDoc;

	@Column(name="estabelecimento_fl_ativado")
	private byte estabelecimentoFlAtivado;

	@Lob
	@Column(name="estabelecimento_latitude")
	private String estabelecimentoLatitude;

	@Column(name="estabelecimento_logo")
	private String estabelecimentoLogo;

	@Column(name="estabelecimento_logradouro")
	private String estabelecimentoLogradouro;

	@Lob
	@Column(name="estabelecimento_longitude")
	private String estabelecimentoLongitude;

	@Column(name="estabelecimento_nome")
	private String estabelecimentoNome;

	@Column(name="estabelecimento_numero")
	private String estabelecimentoNumero;

	@Column(name="estabelecimento_site")
	private String estabelecimentoSite;

	@Column(name="estabelecimento_uf")
	private String estabelecimentoUf;
	
	@QueryProjection
	public Estabelecimento(String estabelecimentoBairro, String estabelecimentoNome){
		this.estabelecimentoBairro = estabelecimentoBairro;
		this.estabelecimentoNome = estabelecimentoNome;
	}

	//bi-directional many-to-one association to AgendarTraducao
	@OneToMany(mappedBy="estabelecimento")
	private List<AgendarTraducao> agendarTraducaos;

	//bi-directional many-to-one association to ArquivoTraduzir
	@OneToMany(mappedBy="estabelecimento")
	private List<ArquivoTraduzir> arquivoTraduzirs;

	//bi-directional many-to-one association to Auditoria
	@OneToMany(mappedBy="estabelecimento")
	private List<Auditoria> auditorias;

	//bi-directional many-to-one association to Cardapio
	@OneToMany(mappedBy="estabelecimento")
	private List<Cardapio> cardapios;

	//bi-directional many-to-one association to Categoria
	@OneToMany(mappedBy="estabelecimento")
	private List<Categoria> categorias;

	//bi-directional many-to-one association to Configuracao
	@OneToMany(mappedBy="estabelecimento")
	private List<Configuracao> configuracaos;

	//bi-directional many-to-one association to Plano
	@ManyToOne
	@JoinColumn(name="plano_id")
	private Plano plano;

	//bi-directional many-to-one association to FCobranca
	@OneToMany(mappedBy="estabelecimento")
	private List<Cobranca> FCobrancas;

	//bi-directional many-to-one association to FFormaPagamento
	@OneToMany(mappedBy="estabelecimento")
	private List<FormaPagamento> FFormaPagamentos;

	//bi-directional many-to-one association to Ingrediente
	@OneToMany(mappedBy="estabelecimento")
	private List<Ingrediente> ingredientes;

	//bi-directional many-to-one association to Palavra
	@OneToMany(mappedBy="estabelecimento")
	private List<Palavra> palavras;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="estabelecimento")
	private List<Usuario> usuarios;

	//bi-directional many-to-one association to ViewsEstabelecimento
	@OneToMany(mappedBy="estabelecimento")
	private List<ViewsEstabelecimento> viewsEstabelecimentos;

	public Estabelecimento() {
	}

	public int getEstabelecimentoId() {
		return this.estabelecimentoId;
	}

	public void setEstabelecimentoId(int estabelecimentoId) {
		this.estabelecimentoId = estabelecimentoId;
	}

	public String getEstabelecimentoBairro() {
		return this.estabelecimentoBairro;
	}

	public void setEstabelecimentoBairro(String estabelecimentoBairro) {
		this.estabelecimentoBairro = estabelecimentoBairro;
	}

	public int getEstabelecimentoCep() {
		return this.estabelecimentoCep;
	}

	public void setEstabelecimentoCep(int estabelecimentoCep) {
		this.estabelecimentoCep = estabelecimentoCep;
	}

	public String getEstabelecimentoChave() {
		return this.estabelecimentoChave;
	}

	public void setEstabelecimentoChave(String estabelecimentoChave) {
		this.estabelecimentoChave = estabelecimentoChave;
	}

	public String getEstabelecimentoCidade() {
		return this.estabelecimentoCidade;
	}

	public void setEstabelecimentoCidade(String estabelecimentoCidade) {
		this.estabelecimentoCidade = estabelecimentoCidade;
	}

	public String getEstabelecimentoCodigo() {
		return this.estabelecimentoCodigo;
	}

	public void setEstabelecimentoCodigo(String estabelecimentoCodigo) {
		this.estabelecimentoCodigo = estabelecimentoCodigo;
	}

	public String getEstabelecimentoComplemento() {
		return this.estabelecimentoComplemento;
	}

	public void setEstabelecimentoComplemento(String estabelecimentoComplemento) {
		this.estabelecimentoComplemento = estabelecimentoComplemento;
	}

	public int getEstabelecimentoDataAtualizacao() {
		return this.estabelecimentoDataAtualizacao;
	}

	public void setEstabelecimentoDataAtualizacao(int estabelecimentoDataAtualizacao) {
		this.estabelecimentoDataAtualizacao = estabelecimentoDataAtualizacao;
	}

	public Date getEstabelecimentoDataCadastro() {
		return this.estabelecimentoDataCadastro;
	}

	public void setEstabelecimentoDataCadastro(Date estabelecimentoDataCadastro) {
		this.estabelecimentoDataCadastro = estabelecimentoDataCadastro;
	}

	public Date getEstabelecimentoDataCadastroPre() {
		return this.estabelecimentoDataCadastroPre;
	}

	public void setEstabelecimentoDataCadastroPre(Date estabelecimentoDataCadastroPre) {
		this.estabelecimentoDataCadastroPre = estabelecimentoDataCadastroPre;
	}

	public String getEstabelecimentoDescricao() {
		return this.estabelecimentoDescricao;
	}

	public void setEstabelecimentoDescricao(String estabelecimentoDescricao) {
		this.estabelecimentoDescricao = estabelecimentoDescricao;
	}

	public String getEstabelecimentoDoc() {
		return this.estabelecimentoDoc;
	}

	public void setEstabelecimentoDoc(String estabelecimentoDoc) {
		this.estabelecimentoDoc = estabelecimentoDoc;
	}

	public byte getEstabelecimentoFlAtivado() {
		return this.estabelecimentoFlAtivado;
	}

	public void setEstabelecimentoFlAtivado(byte estabelecimentoFlAtivado) {
		this.estabelecimentoFlAtivado = estabelecimentoFlAtivado;
	}

	public String getEstabelecimentoLatitude() {
		return this.estabelecimentoLatitude;
	}

	public void setEstabelecimentoLatitude(String estabelecimentoLatitude) {
		this.estabelecimentoLatitude = estabelecimentoLatitude;
	}

	public String getEstabelecimentoLogo() {
		return this.estabelecimentoLogo;
	}

	public void setEstabelecimentoLogo(String estabelecimentoLogo) {
		this.estabelecimentoLogo = estabelecimentoLogo;
	}

	public String getEstabelecimentoLogradouro() {
		return this.estabelecimentoLogradouro;
	}

	public void setEstabelecimentoLogradouro(String estabelecimentoLogradouro) {
		this.estabelecimentoLogradouro = estabelecimentoLogradouro;
	}

	public String getEstabelecimentoLongitude() {
		return this.estabelecimentoLongitude;
	}

	public void setEstabelecimentoLongitude(String estabelecimentoLongitude) {
		this.estabelecimentoLongitude = estabelecimentoLongitude;
	}

	public String getEstabelecimentoNome() {
		return this.estabelecimentoNome;
	}

	public void setEstabelecimentoNome(String estabelecimentoNome) {
		this.estabelecimentoNome = estabelecimentoNome;
	}

	public String getEstabelecimentoNumero() {
		return this.estabelecimentoNumero;
	}

	public void setEstabelecimentoNumero(String estabelecimentoNumero) {
		this.estabelecimentoNumero = estabelecimentoNumero;
	}

	public String getEstabelecimentoSite() {
		return this.estabelecimentoSite;
	}

	public void setEstabelecimentoSite(String estabelecimentoSite) {
		this.estabelecimentoSite = estabelecimentoSite;
	}

	public String getEstabelecimentoUf() {
		return this.estabelecimentoUf;
	}

	public void setEstabelecimentoUf(String estabelecimentoUf) {
		this.estabelecimentoUf = estabelecimentoUf;
	}

	public List<AgendarTraducao> getAgendarTraducaos() {
		return this.agendarTraducaos;
	}

	public void setAgendarTraducaos(List<AgendarTraducao> agendarTraducaos) {
		this.agendarTraducaos = agendarTraducaos;
	}

	public AgendarTraducao addAgendarTraducao(AgendarTraducao agendarTraducao) {
		getAgendarTraducaos().add(agendarTraducao);
		agendarTraducao.setEstabelecimento(this);

		return agendarTraducao;
	}

	public AgendarTraducao removeAgendarTraducao(AgendarTraducao agendarTraducao) {
		getAgendarTraducaos().remove(agendarTraducao);
		agendarTraducao.setEstabelecimento(null);

		return agendarTraducao;
	}

	public List<ArquivoTraduzir> getArquivoTraduzirs() {
		return this.arquivoTraduzirs;
	}

	public void setArquivoTraduzirs(List<ArquivoTraduzir> arquivoTraduzirs) {
		this.arquivoTraduzirs = arquivoTraduzirs;
	}

	public ArquivoTraduzir addArquivoTraduzir(ArquivoTraduzir arquivoTraduzir) {
		getArquivoTraduzirs().add(arquivoTraduzir);
		arquivoTraduzir.setEstabelecimento(this);

		return arquivoTraduzir;
	}

	public ArquivoTraduzir removeArquivoTraduzir(ArquivoTraduzir arquivoTraduzir) {
		getArquivoTraduzirs().remove(arquivoTraduzir);
		arquivoTraduzir.setEstabelecimento(null);

		return arquivoTraduzir;
	}

	public List<Auditoria> getAuditorias() {
		return this.auditorias;
	}

	public void setAuditorias(List<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}

	public Auditoria addAuditoria(Auditoria auditoria) {
		getAuditorias().add(auditoria);
		auditoria.setEstabelecimento(this);

		return auditoria;
	}

	public Auditoria removeAuditoria(Auditoria auditoria) {
		getAuditorias().remove(auditoria);
		auditoria.setEstabelecimento(null);

		return auditoria;
	}

	public List<Cardapio> getCardapios() {
		return this.cardapios;
	}

	public void setCardapios(List<Cardapio> cardapios) {
		this.cardapios = cardapios;
	}

	public Cardapio addCardapio(Cardapio cardapio) {
		getCardapios().add(cardapio);
		cardapio.setEstabelecimento(this);

		return cardapio;
	}

	public Cardapio removeCardapio(Cardapio cardapio) {
		getCardapios().remove(cardapio);
		cardapio.setEstabelecimento(null);

		return cardapio;
	}

	public List<Categoria> getCategorias() {
		return this.categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Categoria addCategoria(Categoria categoria) {
		getCategorias().add(categoria);
		categoria.setEstabelecimento(this);

		return categoria;
	}

	public Categoria removeCategoria(Categoria categoria) {
		getCategorias().remove(categoria);
		categoria.setEstabelecimento(null);

		return categoria;
	}

	public List<Configuracao> getConfiguracaos() {
		return this.configuracaos;
	}

	public void setConfiguracaos(List<Configuracao> configuracaos) {
		this.configuracaos = configuracaos;
	}

	public Configuracao addConfiguracao(Configuracao configuracao) {
		getConfiguracaos().add(configuracao);
		configuracao.setEstabelecimento(this);

		return configuracao;
	}

	public Configuracao removeConfiguracao(Configuracao configuracao) {
		getConfiguracaos().remove(configuracao);
		configuracao.setEstabelecimento(null);

		return configuracao;
	}

	public Plano getPlano() {
		return this.plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public List<Cobranca> getFCobrancas() {
		return this.FCobrancas;
	}

	public void setFCobrancas(List<Cobranca> FCobrancas) {
		this.FCobrancas = FCobrancas;
	}

	public Cobranca addFCobranca(Cobranca FCobranca) {
		getFCobrancas().add(FCobranca);
		FCobranca.setEstabelecimento(this);

		return FCobranca;
	}

	public Cobranca removeFCobranca(Cobranca FCobranca) {
		getFCobrancas().remove(FCobranca);
		FCobranca.setEstabelecimento(null);

		return FCobranca;
	}

	public List<FormaPagamento> getFFormaPagamentos() {
		return this.FFormaPagamentos;
	}

	public void setFFormaPagamentos(List<FormaPagamento> FFormaPagamentos) {
		this.FFormaPagamentos = FFormaPagamentos;
	}

	public FormaPagamento addFFormaPagamento(FormaPagamento FFormaPagamento) {
		getFFormaPagamentos().add(FFormaPagamento);
		FFormaPagamento.setEstabelecimento(this);

		return FFormaPagamento;
	}

	public FormaPagamento removeFFormaPagamento(FormaPagamento FFormaPagamento) {
		getFFormaPagamentos().remove(FFormaPagamento);
		FFormaPagamento.setEstabelecimento(null);

		return FFormaPagamento;
	}

	public List<Ingrediente> getIngredientes() {
		return this.ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Ingrediente addIngrediente(Ingrediente ingrediente) {
		getIngredientes().add(ingrediente);
		ingrediente.setEstabelecimento(this);

		return ingrediente;
	}

	public Ingrediente removeIngrediente(Ingrediente ingrediente) {
		getIngredientes().remove(ingrediente);
		ingrediente.setEstabelecimento(null);

		return ingrediente;
	}

	public List<Palavra> getPalavras() {
		return this.palavras;
	}

	public void setPalavras(List<Palavra> palavras) {
		this.palavras = palavras;
	}

	public Palavra addPalavra(Palavra palavra) {
		getPalavras().add(palavra);
		palavra.setEstabelecimento(this);

		return palavra;
	}

	public Palavra removePalavra(Palavra palavra) {
		getPalavras().remove(palavra);
		palavra.setEstabelecimento(null);

		return palavra;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setEstabelecimento(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setEstabelecimento(null);

		return usuario;
	}

	public List<ViewsEstabelecimento> getViewsEstabelecimentos() {
		return this.viewsEstabelecimentos;
	}

	public void setViewsEstabelecimentos(List<ViewsEstabelecimento> viewsEstabelecimentos) {
		this.viewsEstabelecimentos = viewsEstabelecimentos;
	}

	public ViewsEstabelecimento addViewsEstabelecimento(ViewsEstabelecimento viewsEstabelecimento) {
		getViewsEstabelecimentos().add(viewsEstabelecimento);
		viewsEstabelecimento.setEstabelecimento(this);

		return viewsEstabelecimento;
	}

	public ViewsEstabelecimento removeViewsEstabelecimento(ViewsEstabelecimento viewsEstabelecimento) {
		getViewsEstabelecimentos().remove(viewsEstabelecimento);
		viewsEstabelecimento.setEstabelecimento(null);

		return viewsEstabelecimento;
	}

}