package br.com.mainu.bussines.estabelecimentos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.mainu.entity.Estabelecimento;
import br.com.mainu.entity.QEstabelecimento;

@Stateless
public class EstabelecimentoManagerBean {

	private QEstabelecimento qEstabelecimento;
	private JPAQuery<Estabelecimento> query;
	
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("static-access")
	public List<Estabelecimento> buscaEstabelecimentos(){
		this.qEstabelecimento = QEstabelecimento.estabelecimento;
		this.query = new JPAQuery<>(em);
		return this.query.select(qEstabelecimento.create(qEstabelecimento.estabelecimentoBairro, qEstabelecimento.estabelecimentoNome)).from(qEstabelecimento).fetch();
	}
	
	
	
	
	
}
