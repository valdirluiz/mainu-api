package br.com.mainu.rest.estabelecimentos;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.mainu.bussines.estabelecimentos.EstabelecimentoManagerBean;
import br.com.mainu.entity.Estabelecimento;

@Path("/estabelecimentos")
public class EstabelecimentoResource {
	
	@EJB
	private EstabelecimentoManagerBean managerBean;
	
	@GET
	public List<Estabelecimento> getAll(){
		return managerBean.buscaEstabelecimentos();
	}
	
}
